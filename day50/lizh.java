// todo next “lizhonghao-2016-10-7”
import java.util.ArrayList;
import java.util.LinkedList;
public class LevelOrderTraversalFromLeafToRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //          3
		//         /  \
		//        9   20 
		//           /  \
		//          15   7
			TreeNode root=new TreeNode(3);
			root.left=new TreeNode(9);
			root.right=new TreeNode(20);
			root.right.left=new TreeNode(15);
			root.right.right=new TreeNode(7);

           System.out.println("层序遍历的结果为："+levelOrderTraversalFromLeafToRoot(root));
	}
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	
	//和上一题的思路一样，只在处理结果的时候处理一下就可以了
	public static ArrayList<ArrayList<Integer>> levelOrderTraversalFromLeafToRoot(TreeNode root){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		if(root==null){
			return result;
		}
		
		LinkedList<TreeNode> queue=new LinkedList<>();
		ArrayList<Integer> levelResult=new ArrayList<>();
		int curLevelCount=1;
		int nextLevelCount=0;
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode cur=queue.poll();
			curLevelCount--;
			levelResult.add(cur.val);
			
			if(cur.left!=null){
				nextLevelCount++;
				queue.add(cur.left);
			}
			
			if(cur.right!=null){
				nextLevelCount++;
				queue.add(cur.right);
			}
			
			if(curLevelCount==0){
				curLevelCount=nextLevelCount;
				nextLevelCount=0;
				result.add(0,levelResult);
				levelResult=new ArrayList<Integer>();
			}
		}
		
		return result;
	}
}

