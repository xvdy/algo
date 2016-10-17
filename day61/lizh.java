// todo next “lizhonghao-2016-10-16”
import java.util.ArrayList;

public class UniqueBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class TreeNode{
		int val;
		TreeNode left,right;
		public  TreeNode(int val) {
			this.val=val;
		}
	}
	
	public ArrayList<TreeNode> generateTrees(int n){
		if(n==0){
			return new ArrayList<TreeNode>();
		}
		
		return helper(1,n);
	}
	
	public static ArrayList<TreeNode> helper(int m,int n){
		ArrayList<TreeNode> result=new ArrayList<>();
		if(m>n){
			result.add(null);
			return result;
		}
		
		//产生以i为根节点的树，leftTree和rightTree存放的是左右子树的根节点
		for(int i=m;i<=n;i++){
			ArrayList<TreeNode> leftTree=helper(m, n-1);
			ArrayList<TreeNode> rightTree=helper(i+1, n);
			
			for(TreeNode le:leftTree){
				for(TreeNode ri:rightTree){
					TreeNode cur=new TreeNode(i);
					cur.left=le;
					cur.right=ri;
					result.add(cur);
				}
			}
		}
		
		return result;
	}
}

