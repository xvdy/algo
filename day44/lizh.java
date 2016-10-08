// todo next “lizhonghao-2016-10-07”
import java.util.HashMap;
import java.util.Stack;
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs=new String("([)]");
		if(isValidParentheses(strs)){
			System.out.println("匹配成功！");
		}else{
			System.out.println("匹配不成功");
		}
	}
	
	public static boolean isValidParentheses(String strs){
		HashMap<Character, Character> map=new HashMap<>();
		map .put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<strs.length();i++){
			if(map.keySet().contains(strs.charAt(i))){
				stack.push(strs.charAt(i));
			}else{
				if(!stack.empty() && map.get(stack.peek())==strs.charAt(i)){
					stack.pop();
				}else{
					return false;
				}
			}
		}
		
		return stack.empty();	
	}
}

