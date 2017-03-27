// todo next “lizhonghao-2017-02-12”
package MicroSoftOneHundredExersizes;

public class MergeListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		node1.next=new ListNode(2);
		node1.next.next=new ListNode(3);
		
		ListNode node2=new ListNode(2);
		node2.next=new ListNode(3);
		node2.next.next=new ListNode(5);
		
		display(node1);
		System.out.println();
		display(node2);
		System.out.println();
		display(append(node1, node2));
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		public ListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}
	
	public static ListNode append(ListNode node1,ListNode node2){
		ListNode mergeNode = new ListNode(Integer.MAX_VALUE);
		ListNode result = mergeNode;
		while(node1 != null && node2 != null){
			if(node1.val < node2.val){
				if(node1.val != mergeNode.val){
					mergeNode.next = node1;
					mergeNode = mergeNode.next;
				}
				node1=node1.next;
			}else{
				if(node2.val != mergeNode.val){
					mergeNode.next = node2;
					mergeNode = mergeNode.next;
				}
				node2 = node2.next;
			}
			//mergeNode = mergeNode.next;
		}
		
		//System.out.println(mergeNode.val);
		while(node1 != null){
			if(node1.val != mergeNode.val){
				mergeNode.next=node1;
				mergeNode = mergeNode.next;
			}
			node1 = node1.next;
		}
		while(node2 != null){
			if(node2.val != mergeNode.val){
				mergeNode.next = node2;
				mergeNode = mergeNode.next;
			}
			node2=node2.next;
		}
		return result.next;
	}
	
	public static void display(ListNode head){
		while(head != null){
			System.out.print(head.val+"->");
			head = head.next;
		}
	}
}


