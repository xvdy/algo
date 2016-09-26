// todo next “lizhonghao-2016-09-23”
import java.util.HashMap;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int key;
		int val;
		Node pre;
		Node next;
		public Node(int key,int val) {
		// TODO Auto-generated constructor stub
			this.key=key;
			this.val=val;
		}
	}
	
	int capacity;
	HashMap<Integer, Node> map=new HashMap<>();
	Node head=null;
	Node end=null;
	
	public LRUCache(int capacity){
		this.capacity=capacity;
	}
	
	public void remove(Node n){
		if(n.pre!=null){
			n.pre.next=n.next;
		}else{
			head=n.next;
		}
		
		if(n.next!=null){
			n.next.pre=n.pre;
		}else{
			end=n.pre;
		}
	}
	
	public void setHead(Node n){
		n.next=head;
		n.pre=null;
		
		if(head!=null){
			head.pre=n;
		}
		
		head=n;
	}
	
	public int get(int key){
		if(map.containsKey(key)){
			Node n=map.get(key);
			remove(n);
			setHead(n);
			return n.val;
		}
		
		return -1;
	}
	
	public void set(int key,int value){
		if(map.containsKey(key)){
			Node old=map.get(key);
			old.val=value;
			remove(old);
			setHead(old);
		}else{
			Node newnode=new Node(key, value);
			if(map.size()<capacity){
				setHead(newnode);
			}else{
				map.remove(end.key);
				remove(end);
				setHead(newnode);
			}
			
			map.put(key, newnode);
		}
	}
}


