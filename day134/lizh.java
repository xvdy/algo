// todo next “lizhonghao-2016-11-28”
import java.util.Stack;
public class TurnBSTToDuLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class BSTTreeNode{
		int value;
		BSTTreeNode left;
		BSTTreeNode right;
		public BSTTreeNode(int value) {
			// TODO Auto-generated constructor stub
			this.value=value;
		}
	}
	
	public BSTTreeNode resort(BSTTreeNode root){
		Stack<BSTTreeNode> stack=new Stack<>();
		BSTTreeNode head=null;
		BSTTreeNode cur=null;
		
		while(root!=null || !stack.isEmpty()){
			while(root!=null){
				stack.push(root);
				root=root.left;
			}
			
			if(!stack.isEmpty()){
				root=stack.pop();
				if(cur==null){
					head=root;
					head.left=null;
					cur=root;
				}else{
					cur.right=root;
					root.left=cur;
					cur=cur.right;
				}
				root=root.right;	
			}
		}
		
		return head;
	}
}


