// todo next “lizhonghao-2017-11-26”
package MicroSoftOneHundredExersizes;

public class FindKthNodeFromTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		
		System.out.println("倒数第2个结点元素的值为："+findKthNodeFromTail(head, 2).val);
	}
	
	public static class ListNode{
		ListNode next;
		int val;
		public ListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
		}
	}
	
	public static ListNode findKthNodeFromTail(ListNode head,int k){
		if(head==null || k<0){
			return null;
		}
		
		ListNode pre=head;
		ListNode last=head;
		
		for(int i=1;i<k;i++){
			if(pre.next!=null){
				pre=pre.next;
			}else{
				return null;
			}
		}
		
		while(pre.next!=null){
			pre=pre.next;
			last=last.next;
		}
		
		return last;	
	}
}


