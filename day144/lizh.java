// todo next “lizhonghao-2017-1-31”
package MicroSoftOneHundredExersizes;

import java.util.Stack;

public class MirrorOfTreeNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class TreeNode{
		int val=0;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
		}
	}
	
	public static void mirrorOfTreeNode(TreeNode root){
		if(root==null){
			return ;
		}
		
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		while(stack.size()!=0){
			TreeNode node=stack.pop();
			if(node.left!=null || node.right!=null){
				TreeNode temp=node.left;
				node.left=node.right;
				node.right=temp;
			}
			
			if(node.left!=null){
				stack.push(node.left);
			}
			if(node.right!=null){
				stack.push(node.right);
			}
		}
	}
	
	public static void mirrorOfTreeNodeByRecursive(TreeNode root){
		if(root == null){
			return ;
		}
		
		TreeNode node=root.left;
		root.left=root.right;
		root.right=node;
		
		if(root.left!=null){
			mirrorOfTreeNodeByRecursive(root.left);
		}
		if(root.right!=null){
			mirrorOfTreeNodeByRecursive(root.right);
		}
	}
}


