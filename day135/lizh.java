// todo next “lizhonghao-2016-11-28”
import java.util.Stack;
public abstract class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Stack<Integer> stack=new Stack<>();
	Stack<Integer> minStack=new Stack<>();
	
	public void push(int node){
		stack.push(node);
		if(minStack.isEmpty()){
			minStack.push(node);
		}else if(stack.peek()<minStack.peek()){
			minStack.push(node);
		}else{
			minStack.push(minStack.peek());
		}
	}
	
	public void pop(){
		stack.pop();
		minStack.pop();//同步弹出元素
	}
	
	public int min(){
		return minStack.peek();
	}
	
	public int top(){
		return stack.peek();
	}
}

