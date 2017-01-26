// todo next “lizhonghao-2017-1-26”
package MicroSoftOneHundredExersizes;

public class DistanceOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.right.left=new TreeNode(4);
		
		distanceOfTree(root);
		System.out.println(len);
		
	}
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int maxRight;
		int maxLeft;
		int val;
		public TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
		}
	}
	public static int len=0;
	public static void distanceOfTree(TreeNode root){
		if(root==null){
			return ;
		}
		
		if(root.left==null){
			root.maxLeft=0;
		}
		
		if(root.right==null){
			root.maxRight=0;
		}
		
		if(root.left!=null){
			distanceOfTree(root.left);
		}
		
		if(root.right!=null){
			distanceOfTree(root.right);
		}
		
		if(root.left!=null){
			int temp=0;
			temp=root.left.maxLeft>root.left.maxRight?root.left.maxLeft:root.left.maxRight;
			root.maxLeft=temp+1;
		}
		
		if(root.right!=null){
			int temp=0;
			temp=root.right.maxLeft>root.right.maxRight?root.right.maxLeft:root.right.maxRight;
			root.maxRight=temp+1;
		}
		
		if(root.maxLeft+root.maxRight>len){
			len=root.maxLeft+root.maxRight;
		}
	}
}


