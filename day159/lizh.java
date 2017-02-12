// todo next “lizhonghao-2017-02-12”
package MicroSoftOneHundredExersizes;

import java.util.Stack;

public class GetMinByStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Stack<Integer> stackData=new Stack<>();
	public static Stack<Integer> stackMin=new Stack<>();
	
	public static void push(int val){
		if(stackMin.isEmpty()){
			stackMin.push(val);
		}else if(val <= stackMin.peek()){
			stackMin.push(val);
		}
		stackData.push(val);
	}
	
	public static int pop(){
		if(stackData.peek() == stackMin.peek()){
			stackMin.pop();
		}
		return stackData.pop();	
	}
	
	public static int getMin(){
		return stackMin.peek();
	}
}


