// todo next “lizhonghao-2017-02-26”
package MicroSoftOneHundredExersizes;
import java.util.ArrayList;

public class PrintListnodeFromTailToHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	
	public  ArrayList<Integer> result = new ArrayList<>();
	public ArrayList<Integer> solutionByRecursive(ListNode head){
		if(head != null){
			this.solutionByRecursive(head.next);
			result.add(head.val);
		}
		return result;
	}
	
	//链表反转，然后依次打印
	public static ListNode solutionByReverseLinkedList(ListNode head){
		ListNode pre=null;
		while(head != null){
			ListNode temp = head.next;
			head.next = pre;
			pre = head;
			head = temp;
		}
		return pre;
	}
}


