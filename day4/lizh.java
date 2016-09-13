// todo next “lizhonghao-2016-09-12”
import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class TreeNode{
		public int val;
		TreeNode right=null;
		TreeNode left=null;
		public TreeNode(int val){
			this.val=val;
			this.right=null;
			this.left=null;
		}
	}
	 //用辅助栈来实现-非递归
	public static ArrayList<Integer> inOrderTraversal(TreeNode root){
		ArrayList<Integer> rsc=new ArrayList<>();
		if(root==null){
			return rsc;
		}
		
		Stack<TreeNode> stack=new Stack<>();
		TreeNode p=root;
		while(p!=null || !stack.empty()){
			if(p!=null){
				stack.push(p);
				p=p.left;
			}else{
				TreeNode node=stack.pop();
				rsc.add(node.val);
				p=node.left;
			}
		}
		
		return rsc;
	}
	
	 //递归实现-返回的 rsc定义的有点傻逼
	static ArrayList<Integer> rsc=new ArrayList<>();
	public static ArrayList<Integer> inorderTraversal_(TreeNode root){
		if(root!=null)
			recursive(root);
		return rsc;
	}
	public static void recursive(TreeNode root){
		if(root.left!=null)
			recursive(root.left);
		rsc.add(root.val);
		if(root.right!=null)
			recursive(root.right);
	}
	
	public static void createBinaryTree(TreeNode root){
		//
	}
}

