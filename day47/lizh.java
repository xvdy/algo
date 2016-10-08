// todo next “lizhonghao-2016-10-07”
import java.util.Stack;
public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"2","1","+","3","*"};
		System.out.println("表达式的值为："+reversePolishNotation(strs));
	}
	
	public static int reversePolishNotation(String[] strs){
		Stack<Integer> stack=new Stack<>();
		String symbol="+-*/";
		
		for(String str:strs){
			if(!symbol.contains(str)){
				stack.push(Integer.valueOf(str));
				continue;
			}
			
			int a=stack.pop();
			int b=stack.pop();
			if(str.equals("+")){
				stack.push(b+a);
			}else if(str.equals("-")){
				stack.push(b-a);
			}else if(str.equals("*")){
				stack.push(b*a);
			}else{
				stack.push(b/a);
			}
		}
		
		return stack.pop();
	}
}

