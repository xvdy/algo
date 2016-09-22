// todo next “lizhonghao-2016-09-22”
public class LlinkedListCycleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//      |--------|
		//1->2->3->4->5->6
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=new ListNode(6);
		head.next.next.next.next.next.next=head.next.next;
		
		displayBeginOfCycleList(beginOfLinkedList(head));
		System.out.println("环的长度"+lengthOfCycle(head));
		System.out.println("将有环链表转换为单链表后：");
		display(turnCycleListToSingleList(head));
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
	
	public static ListNode beginOfLinkedList(ListNode head){
		ListNode slow=head;
		ListNode fast=head.next;
		
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next.next;
			
			if(fast.next==null || fast.next.next==null){
				System.out.println("链表中不存在环！");
				return head;
			}
		}
		
		System.out.println("链表中存在环");
		while(head!=fast.next){
			head=head.next;
			fast=fast.next;
		}
		
		return head;
	}
	
	public static int lengthOfCycle(ListNode head){
		ListNode slow=head;
		ListNode fast=head.next;
		int length=1;
		
		while(fast!=slow){
			slow=slow.next;
			fast=fast.next.next;
			length++;
			
			if(fast.next==null || fast.next.next==null){
				return 0;
			}
		}
		
		return length;
	}
	
	public static ListNode turnCycleListToSingleList(ListNode head){
		ListNode slow=head;
		ListNode fast=head.next;
		ListNode temp=head;
		
		while(slow!=fast){
			fast=fast.next.next;
			slow=slow.next;
		}
		
		while(temp!=slow.next){
			temp=temp.next;
			slow=slow.next;
		}
		slow.next=null;
		
		return head;
	}
	
	public static void displayBeginOfCycleList(ListNode head){
		System.out.println("环开始结点的值："+head.val);
	}
	
	public static void display(ListNode head){
		while(head!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
	}
}

