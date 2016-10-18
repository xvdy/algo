// todo next “lizhonghao-2016-10-17”
public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class TreeNode{
		int val;
		TreeNode left,right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	
	public static TreeNode convertSortedArrayToBinarySearchTree(int[] arr){
		return buildTree(arr, 0, arr.length-1);
	}
	
	//找出中间元素即为二叉搜索树的根节点，以中点为界左右递归调用来构造树
	public static TreeNode buildTree(int[] arr,int low,int high){
		if(low>high){
			return null;
		}
		
		int mid=(low+high)/2;
		TreeNode node=new TreeNode(arr[mid]);
		node.left=buildTree(arr, low, mid-1);
		node.right=buildTree(arr, mid+1, high);
		
		return node;
	}
}

