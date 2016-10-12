// todo next “lizhonghao-2016-10-10”
public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode first=new TreeNode(1);
		first.left=new TreeNode(2);
		first.right=new TreeNode(3);
		
		TreeNode second=new TreeNode(1);
		second.left=new TreeNode(2);
		second.right=new TreeNode(4);
		if(isSame(first, second)){
			System.out.println("Same Tree!");
		}else{
			System.out.println("is Not Same Tree!");
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
	
	public static boolean isSame(TreeNode first,TreeNode second){
		if(first==null && second==null){
			return true;
		}
		
		if(first==null || second==null){
			return false;
		}
		
		if(first.val==second.val){
			return isSame(first.left, second.left) && isSame(first.right, second.right);
		}else{
			return false;
		}
	}
}

