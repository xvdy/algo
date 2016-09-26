// todo next “lizhonghao-2016-09-22”
import java.util.HashMap;
public class LinkedListCycle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// |-----|
		// 1->2->3
		//
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		//head.next.next.next=new ListNode(1);//这种构造带环链表的形式不对，下面这种才对，java
		//语言的细节需要去好好研究了
		head.next.next.next=head;
		
		display(head);
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
	//还有一种算法就是快慢指针那个思路，如果环存在，那种思路一定有解么？我试试看看能不能证明下
	public static boolean linkedListCycle(ListNode head){
		if(head==null || head.next==null){
			System.out.println("输入的是链表么？？？");
		}
		
		boolean flag=false;
		HashMap<ListNode, Boolean> map=new HashMap<>();
		while(head!=null){
			if(map.containsKey(head)){
				flag=true;
				break;
			}else{
				map.put(head, true);
				head=head.next;
			}
		}

		return flag;
	}
	
	public static void display(ListNode head){
		if(linkedListCycle(head)){
			System.out.println("链表中有环");
		}else{
			System.out.println("链表中无环");
		}
	}

}

