// todo next “lizhonghao-2016-09-20”
public class RemoveDuplicatesFromSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(1);
		head.next.next=new ListNode(2);
		head.next.next.next=new ListNode(3);
		head.next.next.next.next=new ListNode(3);
		
		display(head);
		
		display(removeDup_2(head));
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val=val;
			next=null;
		}
	}
	
	//这个想法不好，太繁琐
	public static ListNode removeDup_1(ListNode head){
		if(head==null){
			return null;
		}
		
		ListNode temp=head;
		ListNode temp_=temp;
		while(head!=null){
			//找出相同结点中最后一个结点
			while(head.next!=null && head.val==head.next.val){
				head=head.next;
			}
			
			//判断最后一个结点和目标链表当前元素，插入目标链表，更新目标链表temp结点
		    if(head.val!=temp.val){
		    	temp.next=head;
		    	temp=temp.next;
		    	head=head.next;
			}else{
				head=head.next;
		    }
		}
		
		return temp_;
	}
	
	//这个方法简便，判断当前结点的值和当前结点下一个结点的值，若相等，则跳过当前结点的下一个结点，否则用当前
	//结点的下一个结点更新当前结点
	// 九章算法给的答案感觉不对，在循环过程中没有更新循环变量
	//妈的，刚开始傻逼了，居然返回循环变量，循环结束，最后就是null。。。。
	public static ListNode removeDup_2(ListNode head){
		if(head==null){
			return null;
		}
		
		ListNode cur=head;
		while(cur!=null){
			if(cur.val==cur.next.val){
				cur.next=cur.next.next;
				cur=cur.next;
			}else{
				cur=cur.next;
			}
		}
	
		return head;
	}
	
	public static void display(ListNode head){
		while(head!=null){
			System.out.print(head.val+"-> ");
			head=head.next;
		}
		
		System.out.println();
	}
}

