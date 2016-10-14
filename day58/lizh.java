// todo next “lizhonghao-2016-10-14”
public class ConstructBinaryTreeFromPreAndInorder {

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
	
	public static TreeNode buildTree(int[] preOrder,int[] inOrder){
		int preStart=0;
		int preEnd=preOrder.length-1;
		int inStart=0;
		int inEnd=inOrder.length-1;
		
		return construct(preOrder, preStart, preEnd, inOrder, inStart, inEnd);
	}
	
	//思路:在先序中的第一个元素是根节点，在中序中找到这个结点的下标，左右两边分别是左子树和右子树，分别计算长度
	//也就是左子树和右子树结点的个数，计算长度时中序数组的起点下标不一定是0，而是inStart,数组的长度是
	//index-inStart,然后对左子树和右子树递归调用，返回根节点就可以了。
	public static TreeNode construct(int[] preOrder,int preStart,int preEnd,int[] inOrder,int inStart,int inEnd){
		if(preStart>preEnd || inStart>inEnd){
			return null;
		}
		
		int val=preOrder[preStart];
		TreeNode p=new TreeNode(val);
		
		int index=0;
		for(int i=0;i<inOrder.length;i++){
			if(val==inOrder[i]){
				index=i;
				break;
			}
		}
		
		p.left=construct(preOrder, preStart+1, preStart+index-inStart, inOrder, inStart, index-1);
		p.right=construct(preOrder, preStart+index-inStart+1, preEnd, inOrder, index+1, inEnd);
		
		return p;
	}
}

