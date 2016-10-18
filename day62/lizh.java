// todo next “lizhonghao-2016-10-17”
import java.util.ArrayList;

public class ValidBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//           1
		//          / \
		//         3   5
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(3);
		root.right=new TreeNode(5);
		if(isValidBinarySearchTreeByTraverse(root)){
			System.out.println("该二叉树是二叉搜索树！");
		}else{
			System.out.println("该二叉树不是二叉搜索树！");
		}
	}
	
	public static class TreeNode{
		int val;
		TreeNode left,right;
		public  TreeNode(int val) {
			this.val=val;
		}
	}
	
	//采用中序遍历的方式
	public static boolean isValidBinarySearchTreeByTraverse(TreeNode root){
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(null);
		return helper(root, arr);
	}
	
	public static boolean helper(TreeNode root,ArrayList<Integer> arr){
		if(root ==null){
			return true;
		}
		
		boolean left=helper(root.left, arr);
		
		if(arr.get(arr.size()-1)!=null && root.val<=arr.get(arr.size()-1)){
			return false;
		}
		
		arr.add(root.val);
		
		boolean right=helper(root.right, arr);
		
		return left && right;
	}
	
	//采用递归
	public static boolean isValidBST(TreeNode root){
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isBST(TreeNode root,int low,int high){
		if(root==null){
			return true;
		}
		
		if(low < root.val && root.val < high){
			return isBST(root.left, low, root.val) && isBST(root.right, root.val, high);
		}else{
			return false;
		}
	}
}

