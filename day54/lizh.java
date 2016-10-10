// todo next “lizhonghao-2016-10-10”
public class SymmtricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                 1
		//               /  \
		//              2    2
		//             / \  / \
		//            3   4 5  3
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(2);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(4);
		root.right.left=new TreeNode(5);
		root.right.right=new TreeNode(3);
		
		if(isSymmetric(root)){
			System.out.println("Tree is Symmetric!");
		}else{
			System.out.println("Tree is not Symmetric!");
		}
	}
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	
	public static boolean isSymmetric(TreeNode root){
		if(root==null){
			return true;
		}
		
		return isSymmetric(root.left, root.right);
	}
	
	public static boolean isSymmetric(TreeNode left,TreeNode right){
		if(left==null && right==null){
			return true;
		}else if(left==null || right==null){
			return false;
		}
		
		if(left.val!=right.val){
			return false;
		}
		
		if(!isSymmetric(left.left,right.right)){
			return false;
		}
		
		if(!isSymmetric(left.right, right.left)){
			return false;
		}
		
		return true;
	}
}

