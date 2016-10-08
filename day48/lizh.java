// todo next “lizhonghao-2016-10-09”
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
		System.out.println();
		
		System.out.println("非递归方法中序遍历的结果:"+inOrderTranversal(root));
		System.out.println("递归方法中序遍历的结果:"+inOrderTranversal_1(root));
		System.out.println();
		
		System.out.println("非递归方法后序遍历的结果:"+postOrderTranversal(root));
		System.out.println("递归方法后序遍历的结果:"+postOrderTranversal_1(root));
		System.out.println();
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
	
	//中序遍历
	//非递归
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
	
	//递归实现
	public static ArrayList<Integer> inOrderTranversal_1(TreeNode root){
		ArrayList<Integer> result=new ArrayList<>();
		
		if(root!=null){
			recursive_1(root,result);
		}
		
		return result;
	}
	
	public static void recursive_1(TreeNode p,ArrayList<Integer> result){
		if(p.left!=null){
			recursive_1(p.left,result);
		}
		
		result.add(p.val);
		
		if(p.right!=null){
			recursive_1(p.right,result);
		}
	}
	
	//后序遍历
	//非递归;这个方法非常巧妙！！
	public static ArrayList<Integer> postOrderTranversal(TreeNode root){
		ArrayList<Integer> result=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		
		if(root==null){
			return result;
		}
		
		stack.push(root);
		while(!stack.empty()){
			TreeNode temp=stack.peek();
			if(temp.left==null && temp.right==null){
				result.add(stack.pop().val);
			}else{
				if(temp.right!=null){
					stack.push(temp.right);
					temp.right=null;
				}
				
				if(temp.left!=null){
					stack.push(temp.left);
					temp.left=null;
				}
			}
		}
		
		return result;	
	}
	
	//递归实现
	public static ArrayList<Integer> postOrderTranversal_1(TreeNode root){
		ArrayList<Integer> result=new ArrayList<>();
		
		if(root==null){
			return result;
		}
		
		recursive_2(root, result);
		
		return result;
	}
	
	public static void recursive_2(TreeNode root,ArrayList<Integer> result){
		if(root==null){
			return;
		}
		
		recursive_2(root.left, result);
		//System.out.println(result);
		
		recursive_2(root.right,result);
		System.out.println(result);
		//result.add(root.val);
	}
}

