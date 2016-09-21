// todo next “lizhonghao-2016-09-20”
public class SwapPairsNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		
		display(head);
		display(swapPairNodes(head));
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
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
	
	//在链表的前面补一个结点，非常巧妙，脑子进屎了，为啥我想不出来,结点的交换感觉好神奇
	public static ListNode swapPairNodes(ListNode head){
		ListNode addNode=new ListNode(0);
		addNode.next=head;
		head=addNode;
		
		while(head.next!=null && head.next.next!=null){
			ListNode ptr1=head.next;
			ListNode ptr2=head.next.next;
			
			head.next=ptr2;
			ptr1.next=ptr2.next;
			ptr2.next=ptr1;
			
			head=ptr1;
		}
		
		return addNode.next;
	}
}

