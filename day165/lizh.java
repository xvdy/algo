// todo next “lizhonghao-2017-02-27”
package MicroSoftOneHundredExersizes;

public class ConstructTreeNodeByPreorderAndInorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class TreeNode{
		int val;
		TreeNode right,left;
		public TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
		}
	}
	
	public static TreeNode solution(int[] preOrder,int[] inOrder){
		TreeNode root=constructTreeNode(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
		return root;
	}
	public static TreeNode constructTreeNode(int[] preOrder,int preStart,int preEnd,int[] inOrder,int inStart,int inEnd){
		if(preStart > preEnd || inStart > inEnd){
			return null;
		}
		TreeNode root=new TreeNode(preOrder[preStart]);
		for(int i=inStart;i<=inEnd;++i){
			if(preOrder[preStart] == inOrder[i]){
				root.left=constructTreeNode(preOrder, preStart+1, preStart+i-inStart, inOrder, inStart, i-1);
				root.right=constructTreeNode(preOrder, preStart+i-inStart+1, preEnd, inOrder, i+1, inEnd);
			}
		}
		return root;
	}
}


