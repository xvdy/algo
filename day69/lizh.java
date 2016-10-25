// todo next “lizhonghao-2016-10-25”
public class MaximumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//             1
		//            /  \
		//           2    7
		//          / \  / \
		//         5  6 4  9
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(7);
		root.left.left=new TreeNode(5);
		root.left.right=new TreeNode(6);
		root.right.left=new TreeNode(4);
		root.right.right=new TreeNode(9);
		
		System.out.println(maxPathSum(root));
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
	
	public static int calculateSum(TreeNode root,int[] max){
		if(root==null){
			return 0;
		}
		
		int left=calculateSum(root.left, max);
		int right=calculateSum(root.right, max);
		
		int cur=Math.max(root.val, Math.max(root.val+left, root.val+right));
		
		max[0]=Math.max(cur,left+root.val+right);
		
		return cur;
	}
	
	public static int maxPathSum(TreeNode root){
		int max[]=new int[1];
		max[0]=Integer.MIN_VALUE;
		calculateSum(root, max);
		return max[0];
	}
}

