// todo next “lizhonghao-2016-09-7”
package MicroSoftOneHundredExersizes;

import java.util.ArrayList;
import java.util.Stack;

public class PreTraverseInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int val;
		Node left = null,right = null;
		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}
	
	//递归
	public static ArrayList<Integer> preOrderTranversal_recursive(Node root){
		ArrayList<Integer> result=new ArrayList<>();
		recursive(root, result);
		
		return result;	
	}
	public static void recursive(Node root,ArrayList<Integer> result){
		if(root==null){
			return ;
		}
		
		result.add(root.val);
		recursive(root.left, result);
		recursive(root.right, result);
	}
	
	//非递归
	public static ArrayList<Integer> preOrderTranversal(Node root){
		Stack<Node> stack=new Stack<>();
		ArrayList<Integer> result=new ArrayList<>();
		
		if(root==null){
			return result;
		}
		
		stack.push(root);
		while(!stack.empty()){
			Node temp=stack.pop();
			result.add(temp.val);
			
			if(temp.right!=null){
				stack.push(temp.right);
			}
			
			if(temp.left!=null){
				stack.push(temp.left);
			}	
		}
		
		return result;
	}
}


