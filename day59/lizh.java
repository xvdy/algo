// todo next “lizhonghao-2016-10-14”
public class ConstructBinaryTreeFromInorderAndPostorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	
	public static TreeNode buildTree(int[] inOrder,int[] postOrder){
		int inStart=0;
		int inEnd=inOrder.length-1;
		int postStart=0;
		int postEnd=postOrder.length-1;
		
		return construct(inOrder, inStart, inEnd, postOrder, postStart, postEnd);
	}
	
	//思路和前一题类似，注意数组长度和下标
	public static TreeNode construct(int[] inOrder,int inStart,int inEnd,
									 int[] postOrder,int postStart,int postEnd){
		if(inStart>inEnd || postStart>postEnd){
			return null;
		}
		
		int val=postOrder[postEnd];
		TreeNode root=new TreeNode(val);
		
		int k=0;
		for(int i=0;i<inOrder.length;i++){
			if(inOrder[i]==val){
				k=i;
				break;
			}
		}
		
		root.left=construct(inOrder, inStart, k-1, postOrder, postStart, postStart+k-inStart-1);
		root.right=construct(inOrder, k+1, inEnd, postOrder, postStart+k-inStart, postEnd-1);
		
		return root;
	}
}

