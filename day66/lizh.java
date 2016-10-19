// todo next “lizhonghao-2016-10-19”
public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //      1
		//     /  \
		//    2    3
		//        /
		//       4
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.right.left=new TreeNode(4);
		
		System.out.println("最大深度是："+getMaxDeepth(root));

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
	
	public static int getMax(TreeNode root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		
		if(root.left==null && root.right==null){
			return 1;
		}
		
		return Math.max(getMax(root.left),getMax(root.right))+1;
	}
	
	public static int getMaxDeepth(TreeNode root){
		if(root==null){
			return 0;
		}
		
		return getMax(root);
	}
}

