// todo next “lizhonghao-2016-09-19”
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		
		System.out.println("原始链表：");
		display(head);
		System.out.println();

	/*	System.out.println("原始链表全部翻转后：");
		display(reverseLinkedList_1(head));
		System.out.println();*/
			
		System.out.println("原始链表部分翻转后：");
		display(reverseLinkedList_2(head, 2, 4));
			
		
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
			next=null;
		}
	}
	
	//全部翻转
	public static ListNode reverseLinkedList_1(ListNode head){
		ListNode prev=null;
		
		while(head!=null){
			ListNode temp=head.next;
			head.next=prev;
			prev=head;
			head=temp;
		}
		
		return prev;
	}
	
	
	//部分翻转
	public static ListNode reverseLinkedList_2(ListNode head,int m,int n){
		if(m>n || head==null){
			return null;
		}
		
		//为了下标一致，在前面补了一个结点
		ListNode zero=new ListNode(0);
		zero.next=head;
		head=zero;
		
		//找到第m个结点前的一个结点
		for(int i=1;i<m;i++){
			if(head==null){
				return null;
			}
			
			head=head.next;
		}
		
		//把开始结点和开始结点的前一个节点存下来，为翻转后的结点连接做准备
		ListNode prenode=head;
		ListNode mnode=head.next;
		ListNode nnode=mnode;
		ListNode postnode=mnode.next;
		for(int i=m;i<n;i++){
			if(postnode==null){
				return null;
			}
			
			ListNode temp=postnode.next;
			postnode.next=nnode;
			nnode=postnode;
			postnode=temp;
		}
		
		prenode.next=nnode;
		mnode.next=postnode;
		
		return zero.next;
	}
	
	public static void display(ListNode head){
		while(head!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
	}
}


