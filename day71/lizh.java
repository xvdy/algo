// todo next “lizhonghao-2016-10-26”
public class SumRootToLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//       1
		//      / \
		//     2   3
		//    / \   \
		//   4   5   6
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.right=new TreeNode(6);
		
		System.out.println(sumNumbers(root));
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
	
	public static int dfs(TreeNode root,int num,int sum){
		if(root==null){
			return sum;
		}
		
		num=num*10+root.val;
		
		if(root.left==null && root.right==null){
			return sum+num;
		}
		
		sum=dfs(root.left, num, sum)+dfs(root.right, num, sum);
		return sum;
	}
	
	public static int sumNumbers(TreeNode root){
		if(root==null){
			return 0;
		}
		
		return dfs(root, 0, 0);
	}
}

