// todo next “lizhonghao-2016-09-22”
public class ReOrderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=new ListNode(6);
		
		display(head);
		System.out.println();
		System.out.println("重新排序后：");
		display(reOrderList(head));
		
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
	
	public static ListNode reOrderList(ListNode head){
		ListNode slow=head;
		ListNode fast=head;
		ListNode pre=null;
		ListNode result=head;
		
		//将原链表分成两个子链表，这个方法在链表长度为奇偶时都有效
		while(fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		fast=slow.next;
		slow.next=null;
		
		//后半部分逆序，逆序后头结点为pre;
		while(fast!=null){
			ListNode temp=fast.next;
			fast.next=pre;
			pre=fast;
			fast=temp;
		}
		
		//将两个链表合并，每一个循环将逆序后的一个结点往前一个子链表中合适的位置上插
		while(pre!=null && head!=null){
			ListNode temp1=head.next;
			head.next=pre;
			pre=pre.next;
			head.next.next=temp1;
			head=head.next.next;	
		}
		
		return result;
	}
	
	public static void display(ListNode head){
		while(head!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
	}
}

