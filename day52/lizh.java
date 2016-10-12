// todo next “lizhonghao-2016-10-10”
import java.util.ArrayList;
import java.util.Stack;

public class RecoverBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//         15
		//        /  \
		//       20   9
		//           /
		//         16
		TreeNode root=new TreeNode(15);
		root.left=new TreeNode(20);
		root.right=new TreeNode(9);
		root.right.left=new TreeNode(16);
		
		System.out.println("未恢复之前的中序遍历："+inOrderTranversal(root));
		recoverTree(root);
		System.out.println("恢复之后的中序遍历："+inOrderTranversal(root));

	}
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	
	private static TreeNode firstNode=null;
	private static TreeNode secondNode=null;
	private static TreeNode lastNode=new TreeNode(Integer.MIN_VALUE);
	public static void traverse(TreeNode root){
		if(root==null){
			return;
		}
		
		traverse(root.left);
		if(firstNode == null && root.val<lastNode.val){
			firstNode=lastNode;
		}
		if(firstNode != null && root.val<lastNode.val){
			secondNode=root;
		}
		
		lastNode=root;
		traverse(root.right);
	}
	
	public static void recoverTree(TreeNode root){
		traverse(root);
		
		int temp=firstNode.val;
		firstNode.val=secondNode.val;
		secondNode.val=temp;
	};
	
	//中序遍历
	public static ArrayList<Integer> inOrderTranversal(TreeNode root){
		ArrayList<Integer> result=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		
		TreeNode cur=root;
		while(cur!=null || !stack.empty()){
			while(cur!=null){
				stack.push(cur);
				cur=cur.left;
			}
			
			cur=stack.peek();
			stack.pop();
			result.add(cur.val);
			cur=cur.right;
		}
		
		return result;
	}
}

