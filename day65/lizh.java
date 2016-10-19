// todo next “lizhonghao-2016-10-18”
public class MinumDeepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//       1
		//     /  \
		//    2    3
		//        /
		//       4
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.right.left=new TreeNode(4);
		
		System.out.println("最小深度是："+getMinDeepth(root));

	}
	
	public static class TreeNode{
		int val;
		TreeNode left,right;
		public TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
			left=null;
			right=null;
		}
	}
	
	//递归方式
	public static int getMin(TreeNode root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		
		if(root.left==null || root.right==null){
			return 1;
		}
		
		return Math.min(getMin(root.right),getMin(root.right))+1;
	}
	
	public static int getMinDeepth(TreeNode root){
		if(root==null){
			return 0;
		}
		
		return getMin(root);
	}
}

