// todo next “lizhonghao-2016-10-07”
import java.util.Stack;
public class LongestValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs=new String("()(()()");
		System.out.println("最大匹配的长度是："+longestValidParentheses(strs));
	}
	
	public static int longestValidParentheses(String strs){
		Stack<Integer> stack=new Stack<>();
		int start=-1;
		int maxLength=0;
		
		for(int i=0;i<strs.length();i++){
			if(strs.charAt(i)=='('){
				stack.push(i);
			}else{
				if(!stack.empty()){
					stack.pop();
					if(stack.empty()){
						maxLength=Math.max(i-start, maxLength);
					}else{
						maxLength=Math.max(i-stack.peek(), maxLength);
					}
				}else{
					start=i;
				}
			}
		}
		
		return maxLength;
	}
}

