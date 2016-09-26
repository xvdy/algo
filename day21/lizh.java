// todo next “lizhonghao-2016-09-20”
public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		
		display(head);
		display(removeNthNodeFromEnd(head, 2));
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
	
	public static void display(ListNode head){
		while(head!=null){
			System.out.print(head.val+"-> ");
			head=head.next;
		}
		   
		System.out.println();
	}
	
	public static ListNode removeNthNodeFromEnd(ListNode head,int n){
		if(head==null || n<0){
			return null;
		}
		ListNode n_plusone=head;
		ListNode first=head;
		ListNode result=head;
		//找出倒数n+1个结点
		int i=0;
		while(i<n){
			n_plusone=n_plusone.next;
			i++;
		}
		
		while(n_plusone.next!=null){
			first=first.next;
			n_plusone=n_plusone.next;
		}
		
		if(n==1){
			first.next=null;
		}else{
		first.next=first.next.next;
		}
		
		return result;
	}
}

