// todo next “lizhonghao-2016-10-18”
public class ConvertSortedListToBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//定义一个链表
	public static class ListNode {
		ListNode next;
		int val;
		public ListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
			next=null;
		}
	}
	
	//树的定义
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
	
	//全局变量，在链表中不停往后移动
	public static ListNode temp;
	
	public static TreeNode sortedListToBinaryTree(ListNode head){
		if(head==null){
			return null;
		}
		
		temp=head;
		return constructTree(0, getLength(head)-1);
	}
	
	//获取有序链表的长度
	public static int getLength(ListNode head){
		int len=0;
		ListNode p=head;
		
		while(p!=null){
			len++;
			p=p.next;
		}
		
		return len;
	}
	
	//和数组构建二叉树那个不同，这个是从底部开始往上开始构建
	public static TreeNode constructTree(int low,int high){
		if(low > high){
			return null;
		}
		
		int mid=(low+high)/2;
		
		TreeNode left=constructTree(low, mid-1);
		TreeNode root=new TreeNode(temp.val);
		temp=temp.next;
		TreeNode right=constructTree(mid+1, high);
		
		root.left=left;
		root.right=right;
		
		return root;
	}
}

