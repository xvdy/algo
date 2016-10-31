// todo next “lizhonghao-2016-10-28”
public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1->3->5->2->6
		ListNode head=new ListNode(1);
		head.next=new ListNode(3);
		head.next.next=new ListNode(5);
		head.next.next.next=new ListNode(2);
		head.next.next.next.next=new ListNode(6);
		
		display(head);
		System.out.println();
		display(sortList(head));
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		public  ListNode(int val) {
			this.val=val;
		}
	}
	
	public static ListNode mergeSortedList(ListNode first,ListNode second){
		ListNode head=new ListNode(0);
		ListNode p=head;
		
		ListNode p1=first;
		ListNode p2=second;
		
		while(p1!=null && p2!=null){
			if(p1.val<p2.val){
				p.next=p1;
				p1=p1.next;
			}else{
				p.next=p2;
				p2=p2.next;
			}
			
			p=p.next;
		}
		
		if(p1!=null){
			p.next=p1;
		}
		
		if(p2!=null){
			p.next=p2;
		}
		
		return head.next;
	}
	
	public static ListNode findMiddle(ListNode head){
		ListNode slow=head;
		ListNode fast=head.next.next;
		
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	
	public static ListNode sortList(ListNode head){
		if(head==null || head.next==null){
			return head;
		}
		
		ListNode mid=findMiddle(head);
		ListNode right=sortList(mid.next);
		//将链表分为两段
		mid.next=null;
		ListNode left=sortList(head);
		
		return mergeSortedList(left, right);
	}
	
	public static void display(ListNode head){
		ListNode p=head;
		while(p!=null){
			System.out.print(p.val+"->");
			p=p.next;
		}
	}
}

