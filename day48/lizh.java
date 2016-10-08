// todo next “lizhonghao-2016-10-07”
import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  构建的二叉树
		//       1
		//         \
		//          2
		//         /
		//        3
		TreeNode root=new TreeNode(1);
		root.left=null;
		root.right=new TreeNode(2);
		root.right.left=new TreeNode(3);
		root.right.right=null;
		System.out.println("非递归方法先序遍历的结果:"+preOrderTranversal(root));
		System.out.println("递归方法先序遍历的结果:"+preOrderTranversal_recursive(root));
	}
	
	public static class TreeNode{
		int val;
		TreeNode left,right;
		public TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
		}
	}
	
	//先序遍历
	//非递归
	public static ArrayList<Integer> preOrderTranversal(TreeNode root){
		Stack<TreeNode> stack=new Stack<>();
		ArrayList<Integer> result=new ArrayList<>();
		
		if(root==null){
			return result;
		}
		
		stack.push(root);
		while(!stack.empty()){
			TreeNode temp=stack.pop();
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
	
	//递归
	public static ArrayList<Integer> preOrderTranversal_recursive(TreeNode root){
		ArrayList<Integer> result=new ArrayList<>();
		recursive(root, result);
		
		return result;	
	}
	
	public static void recursive(TreeNode root,ArrayList<Integer> result){
		if(root==null){
			return ;
		}
		
		result.add(root.val);
		recursive(root.left, result);
		recursive(root.right, result);
	}
}

