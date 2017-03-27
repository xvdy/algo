// todo next “lizhonghao-2017-1-31”
package MicroSoftOneHundredExersizes;

import java.util.*;

public class HorizonTranverseInTreeNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
		}
	}
	
	public static ArrayList<Integer> horizonTranverseInTreeNode(TreeNode root){
		ArrayList<Integer> list=new ArrayList<>();
		if(root==null){
			return list;
		}
		
		Queue<TreeNode> queue=new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode node=queue.poll();
			if(node.left!=null){
				queue.offer(node.left);
			}
			if(node.right!=null){
				queue.offer(node.right);
			}
			
			list.add(node.val);
		}
		
		return list;
	}
}


