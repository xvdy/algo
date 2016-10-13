// todo next “lizhonghao-2016-10-13”
public class PopulatingNextRightPointers {
	public class TreeLinkNode{
		int val;
		TreeLinkNode left,right,next;
		public TreeLinkNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
		}
	}
	
	
	//思路：用lastHead和lastCur记录上一层结点，用curHead和cur记录本层节点，双层模型
	public static void connect(TreeLinkNode root){
		if(root==null){
			return ;
		}
		
		TreeLinkNode lastHead=root;
		TreeLinkNode lastCur=null;
		TreeLinkNode curHead=null;
		TreeLinkNode cur=null;
		
		while(lastHead!=null){
			lastCur=lastHead;
			
			//上一层结点的操作，lastHead和lastCur
			while(lastCur!=null){
				if(lastCur.left!=null){
					if(curHead==null){
						curHead=lastCur.left;
						cur=lastCur.left;
					}
				}
				
				if(lastCur.right!=null){
					if(curHead==null){
						curHead=lastCur.right;
						cur=lastCur.right;
					}else{
						cur.next=lastCur.right;
						cur=cur.next;
					}
				}
				
				lastCur=lastCur.next;
			}
			
			//更新上一层节点和目前结点的值
			lastHead=curHead;
			curHead=null;
		}
	}
}

