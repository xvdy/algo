// todo next “lizhonghao-2016-09-20”
public class RotateList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);

		display(head);
		display(rotateList(head, 2));
	}
	
	public static class ListNode{
		public int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
			next=null;
		}
	}
// 我们只需要找到倒数第k+1个结点和最后一个结点，然后将倒数第K+1个结点的next赋值为null,最后一个结点的next
//赋值为第一个节点即可；求倒数第k+1个结点的方法是双下标法，第一个下标指向第一个结点，第二个下标指向K+1个结点
//然后同时向链表的末尾移动，当最后一个结点到达末尾时，第一个下标指向倒数第K+1个下标；
	public static ListNode rotateList(ListNode head,int k){
		ListNode temp=head;
		ListNode first= head;
		ListNode k_plus0ne=head;
		ListNode result=null;

//寻找第k+1个结点
		int i=0;
		while(i<k){
			k_plus0ne=k_plus0ne.next;
			i++;
		}
//同时向链表末尾移动，直到到达链表末尾		
		while(k_plus0ne.next!=null){
			first=first.next;
			k_plus0ne=k_plus0ne.next;
		}
//取出旋转后链表的首结点	
		result=first.next;
//将倒数第K+1个结点的next赋值为null，最后一个结点的next赋值为第一个节点
		first.next=null;
		k_plus0ne.next=temp;
		
		return result;	
	}
	
	public static void display(ListNode head){
		while(head!=null){
			System.out.print(head.val+"-> ");
			head=head.next;
		}
		
		System.out.println();
	}
}

