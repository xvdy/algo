// todo next “lizhonghao-2016-10-28”
public class InsertionSortList {

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
		display(insertionSortList(head));
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		public  ListNode(int val) {
			this.val=val;
		}
	}
	
	public static ListNode insertionSortList(ListNode head){
		if(head==null || head.next==null){
			return head;
		}
		
		ListNode temp=new ListNode(0);
		ListNode cur=head;
		
		while(cur!=null){
			ListNode next=cur.next;
			ListNode pre=temp;
			
			while(pre.next!=null && pre.next.val<cur.val){
				pre=pre.next;
			}
			
			cur.next=pre.next;
			pre.next=cur;
			cur=next;
		}
		
		return temp.next;
	}
	
	public static void display(ListNode head){
		ListNode p=head;
		while(p!=null){
			System.out.print(p.val+"->");
			p=p.next;
		}
	}
}

