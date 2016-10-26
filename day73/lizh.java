// todo next “lizhonghao-2016-10-26”
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1-〉3->5
		//2->4->6
		ListNode first=new ListNode(1);
		first.next=new ListNode(3);
		first.next.next=new ListNode(5);
		display(first);
		System.out.println();
		
		ListNode second=new ListNode(2);
		second.next=new ListNode(4);
		second.next.next=new ListNode(6);
		display(second);
		System.out.println();
		
		display(mergeSortedList(first, second));
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
	
	public static void display(ListNode head){
		ListNode p=head;
		while(p!=null){
			System.out.print(p.val+"->");
			p=p.next;
		}
	}
}

