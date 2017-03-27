// todo next “lizhonghao-2017-02-10”
package MicroSoftOneHundredExersizes;

import java.util.Stack;

public class TwoStackImplementQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	public void push(int val){
		stack1.push(val);
	} 
	
	public int pop(){
		if (stack1.isEmpty() && stack2.isEmpty()) {
			throw new RuntimeException("queue is empty!");
		}
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}


