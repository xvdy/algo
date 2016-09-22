// todo next “lizhonghao-2016-09-21”
import java.util.HashMap;

public class CopyListWithRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// |------|
		// 1->2-> 3->4
		//    |------|
		RandomListNode head=new RandomListNode(1);
		head.random=new RandomListNode(3);
		head.next=new RandomListNode(2);
		head.next.random=new RandomListNode(4);
		head.next.next=new RandomListNode(3);
		head.next.next.next=new RandomListNode(4);
		
		display(head);
		System.out.println("看看是不是深复制？尼玛，坑爹");
		display(copyListWithRandomPointer(head));
	}
	
	public static class RandomListNode{
		int val;
		RandomListNode next,random;
		public RandomListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
			next=null;
			random=null;
		}
	}
	
	//采用hashmap来做，不明白这样整的缘由，先构建主链表，再逐步添加任意结点
	//不用哈希的那个看都看没有看明白。。。
	public static RandomListNode copyListWithRandomPointer(RandomListNode head){
		HashMap<RandomListNode, RandomListNode> map=new HashMap<>();
		RandomListNode result=new RandomListNode(0);
		RandomListNode pre=result;
		RandomListNode newNode=null;
		
		while(head!=null){
			if(map.containsKey(head)){
				newNode=map.get(head);
			}else{
				newNode=new RandomListNode(head.val);
				map.put(head, newNode);
			}
			
			pre.next=newNode;
			
			if(head.random!=null){
				if(map.containsKey(head.random)){
					newNode.random=map.get(head.random);
				}else{
					newNode.random=new RandomListNode(head.random.val);
					map.put(head.random, newNode.random);
				}
			}
			
			pre=newNode;
			head=head.next;
		}
		
		return result.next;
	}
	
	public static void display(RandomListNode head){
		while(head!=null){
			if(head.random!=null){
				System.out.println("当前结点的值："+head.val+" "+"它指向下一个结点的值"+head.random.val);
			}else{
				System.out.println("当前结点的值："+head.val+" "+"它没有指向其他结点");
			}
			head=head.next;
		}
	}

