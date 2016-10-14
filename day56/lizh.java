// todo next “lizhonghao-2016-10-12”
import java.util.Stack;

public class FlattenBinaryTreeIntoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //        1
		//       / \
		//      2   3
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		
		flatIntoLinkedList(root);
		while(root!=null){
			System.out.print(root.val+"->");
			root=root.right;
		}
	}
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	
	public static void flatIntoLinkedList(TreeNode root){
		Stack<TreeNode> stack =new Stack<>();
		TreeNode temp=root;
		
		while(temp!=null || !stack.empty()){
			if(temp.right!=null){
				stack.push(temp.right);
			}
			
			if(temp.left!=null){
				temp.right=temp.left;
				temp.left=null;
			}else if(!stack.empty()){
				temp.right=stack.pop();
			}
			
			temp=temp.right;
		}
	}
}

