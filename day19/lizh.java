// todo next “lizhonghao-2016-09-20”
public class RemoveDuplicateFromSortedListTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(1);
		head.next.next=new ListNode(1);
		head.next.next.next=new ListNode(2);
		head.next.next.next.next=new ListNode(3);
		
		display(head);
		display(removeDupLeaveDistinct(head));

	}
	
	public static class ListNode{
		public int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
			next=null;
		}
	}
	
	//先在链表的起始位置补一个元素，构建一个新的链表result，这个做法值得留意，从第二个结点开始遍历寻找相同元素
	//将相同元素记录下来，从第二个结点开始比较，若与相同元素相同，则跳过这个结点,
	public static ListNode removeDupLeaveDistinct(ListNode head){
		if(head==null){
			return null;
		}
		
		ListNode result=new ListNode(0);
		result.next=head;
		
		ListNode temp=result;
		while(temp.next!=null && temp.next.next!=null){
			if(temp.next.val==temp.next.next.val){
				int dup=temp.next.val;
				while(temp.next!=null && temp.next.val==dup){
					temp.next=temp.next.next;//截断相同元素
				}
			}else{
				temp=temp.next;
			}
		}
		
		return result.next;
	}
	
	public static void display(ListNode head){
		while(head!=null){
			System.out.print(head.val+"-> ");
			head=head.next;
		}
		
		System.out.println();
	}
}

