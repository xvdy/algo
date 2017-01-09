// todo next “lizhonghao-2017-1-09”
public class ReverseLinkedList{
	public static class ListNode{
		int val;
		ListNode next;
	}
	
	public ListNode reverseLinkedListByIteration(ListNode head){
		ListNode pre=null;
		while(head!=null){
			ListNode tmp=head.next;
			head.next=pre;
			pre=head;
			head=tmp;
		}
		
		return pre;
	}
	
	public ListNode reverseLinkedListByRecursive(ListNode cur,ListNode pre){
		if(cur.next==null){
			head=cur;
			cur.next=pre;
			return null;
		}
		
		ListNode next1=cur.next;
		cur.next=pre;
		
		reverseLinkedListByRecursive(next1,cur);
		return head;
	}
}

