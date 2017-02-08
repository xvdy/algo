// todo next “lizhonghao-2017-02-08”
package MicroSoftOneHundredExersizes;

import java.util.Stack;

public class PushPopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pushA={1,2,3,4,5};
		int[] popA={4,5,3,2,1};
		if(isPopOrder(pushA, popA)){
			System.out.println("入栈序列和出栈序列匹配！");
		}else{
			System.out.println("入栈序列和出栈序列不匹配！");
		}
	}
	
	public static boolean isPopOrder(int[] pushA,int[] popA){
		if(pushA.length==0 || popA.length==0){
			return false;
		}
		
		int popIndex=0;
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<pushA.length;i++){
			stack.push(pushA[i]);
			while(!stack.isEmpty() && stack.peek() == popA[popIndex]){
				stack.pop();
				popIndex++;
			}
		}
		
		return stack.isEmpty();
	}
}


