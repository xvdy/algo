// todo next “lizhonghao-2016-10-21”
import java.util.LinkedList;
public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//         1
		//        / \
		//       2   3
		//      / \   \
		//     4   6   9
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(6);
		root.right.right=new TreeNode(9);
		
		if(isExistsPathSum(root, 9)){
			System.out.println("存在从根到叶子节点的和等于给定值！");
		}else{
			System.out.println("不存在从根到叶子结点得和等于给定值！");
		}
	}
	
	public static class TreeNode{
		int val;
		TreeNode left,right;
		public TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
			left=null;
			right=null;
		}
	}
	
	//非递归
	public static boolean isExistsPathSum(TreeNode root,int sum){
		if(root==null){
			return false;
		}
		
		LinkedList<TreeNode> node=new LinkedList<>();
		LinkedList<Integer> addSum=new LinkedList<>();
		
		node.add(root);
		addSum.add(root.val);
		
		while(!node.isEmpty()){
			TreeNode cur=node.poll();
			int sumValue=addSum.poll();
			
			if(sumValue==sum && cur.right==null && cur.left==null){
				return true;
			}
			
			if(cur.left!=null){
				node.add(cur.left);
				addSum.add(sumValue+cur.left.val);
			}
			
			if(cur.right!=null){
				node.add(cur.right);
				addSum.add(sumValue+cur.right.val);
			}
		}
		
		return false;
	}
	
	//递归的方法
	public static boolean isExistsPathSumByRecursive(TreeNode root,int sum){
		if(root==null){
			return false;
		}
		
		if(root.val==sum && (root.left==null && root.right==null)){
			return true;
		}
		
		return isExistsPathSumByRecursive(root.left, sum-root.left.val) ||isExistsPathSumByRecursive(root.right, sum-root.right.val);
	}
}

