// todo next “lizhonghao-2016-10-25”
import java.util.ArrayList;
public class PathSumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//        5
		//       / \
		//      4   15
		//     /   
		//    11
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(4);
		root.right=new TreeNode(15);
		root.left.left=new TreeNode(11);
		
		System.out.println(pathSumTwo(root, 20));
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
	
	public static ArrayList<ArrayList <Integer>> pathSumTwo(TreeNode root,int sum){
		ArrayList<ArrayList <Integer>> result=new ArrayList<ArrayList<Integer>>();
		if(root==null){
			return result;
		}
		
		ArrayList<Integer> l=new ArrayList<>();
		l.add(root.val);
		dfs(root, sum-root.val, result, l);
		return result;	
	}
	
	public static void dfs(TreeNode root,int sum,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> l) {
		if(root.left==null && root.right==null && sum==0){
			ArrayList<Integer> temp=new ArrayList<>();
			temp.addAll(l);
			result.add(temp);	
		}
		
		if(root.left!=null){
			l.add(root.left.val);
			dfs(root.left, sum-root.left.val, result, l);
			l.remove(l.size()-1);
		}
		
		if(root.right!=null){
			l.add(root.right.val);
			dfs(root.right, sum-root.right.val, result, l);
			l.remove(l.size()-1);
		}
	}
}

