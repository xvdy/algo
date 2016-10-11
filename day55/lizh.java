// todo next “lizhonghao-2016-10-11”
public class BalancedBinaryTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//         3
		//          \
		//          20
		//         /  \
		//        6    5 
        TreeNode root=new TreeNode(3);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(5);
        
        if(isBalancedTree(root)){
        	System.out.println("Tree is balanced!");
        }else{
        	System.out.println("Tree is not balanced!");
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
	
	public static int maxDepth(TreeNode root){
		if(root==null){
			return 0;
		}
		
		int left=maxDepth(root.left);
		int right=maxDepth(root.right);
		
		if(left==-1 || right==-1 || Math.abs(left-right)>1){
			return -1;
		}
		
		return Math.max(left, right)+1;
	}
	
	public static boolean isBalancedTree(TreeNode root){
		return maxDepth(root)!=-1;
	}
}

