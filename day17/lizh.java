// todo next “lizhonghao-2016-09-19”
public class PartitionList {

	/**
	 * @param args
	 * 想了好久没有想出不用新建链表来实现的方法，仅仅靠结点的移动来实现太复杂，哎套路。。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(4);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(2);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=new ListNode(2);
		
		display(head);
		
		display(partitionList(head, 3));
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
			next=null;
		}
	}
	
	public static ListNode partitionList(ListNode head,int x){
		if(head==null){
			return null;
		}
		
		ListNode left_small=new ListNode(0);
		ListNode right_large=new ListNode(0);
		ListNode left=left_small;
		ListNode right=right_large;
		
		while(head!=null){
			if(head.val<x){
				left.next=head;
				left=head;
			}else{
				right.next=head;
				right=head;
			}
			
			head=head.next;
		}
		
		right.next=null;
		left.next=right_large.next;
		
		return left_small.next;
	}
	
	public static void display(ListNode head){
		while(head!=null){
			System.out.print(head.val+"-> ");
			head=head.next;
		}
		
		System.out.println();
	}

}

