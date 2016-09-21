// todo next “lizhonghao-2016-09-21”
public class ReverseNodesInKGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		
		display(head);
		display(reversNodesInKGroup(head, 2));

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
	
	public static ListNode reverseLinkedList_2(ListNode head,int m,int n){
		if(m>n || head==null){
			return null;
		}
		
		//为了下标一致，在前面补了一个结点，链表中下标是从1开始
		ListNode zero=new ListNode(0);
		zero.next=head;
		head=zero;
		
		//找到第m个结点前的一个结点
		for(int i=1;i<m;i++){
			if(head==null){
				return null;
			}
			
			head=head.next;
		}
		
		//把开始结点和开始结点的前一个节点存下来，为翻转后的结点连接做准备
		ListNode prenode=head;
		ListNode mnode=head.next;
		ListNode nnode=mnode;
		ListNode postnode=mnode.next;
		for(int i=m;i<n;i++){
			if(postnode==null){
				return null;
			}
			
			ListNode temp=postnode.next;
			postnode.next=nnode;
			nnode=postnode;
			postnode=temp;
		}
		
		prenode.next=nnode;
		mnode.next=postnode;
		
		return zero.next;
	}
	
	//调用了前面部分链表翻转的函数实现的，在递归调用中需要注意更新头结点的值
	public static ListNode reversNodesInKGroup(ListNode head,int k){
		int length=1;
		ListNode temp=head;
		ListNode result=null;
	
		while(temp.next!=null){
			length++;
			temp=temp.next;
		}
		
		int leave=length % k;
		int groupNubers=(length-leave)/k;
		int m_temp=1;
		int n_temp=k;
		
		/*result=reverseLinkedList_2(head, m_temp, n_temp);*/
		for(int i=0;i<groupNubers;i++){
			result=reverseLinkedList_2(head, m_temp, n_temp);
			m_temp+=k;
			n_temp+=k;
			head=result;
		}
		
		return result;
	}
}

