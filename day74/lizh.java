// todo next “lizhonghao-2016-10-27”
public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class ListNode{
		int val;
		ListNode next;
		public  ListNode(int val) {
			this.val=val;
		}
	}
	//两个两个进行比较，在上一题的基础上进行
	public static ListNode mergeSortedList(ListNode first,ListNode second){
		ListNode head=new ListNode(0);
		ListNode p=head;
		
		ListNode p1=first;
		ListNode p2=second;
		
		while(p1!=null && p2!=null){
			if(p1.val<p2.val){
				p.next=p1;
				p1=p1.next;
			}else{
				p.next=p2;
				p2=p2.next;
			}
			
			p=p.next;
		}
		
		if(p1!=null){
			p.next=p1;
		}
		
		if(p2!=null){
			p.next=p2;
		}
		
		return head.next;
	}
	
	public static ListNode mergeKSortedLists(ListNode[] lists){
		if(lists==null || lists.length==0){
			return null;
		}
		
		ListNode temp=lists[0];
		for(int i=1;i<lists.length;i++){
			temp=mergeSortedList(temp,lists[i]);
		}
		
		return temp;
	}
	
	//还有一种比较巧妙地方法，利用优先级队列数据结构
}

