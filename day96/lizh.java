// todo next “lizhonghao-2016-11-09”
import java.util.ArrayList;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(generateParentheses(3));
	}
	
	public static void helper(ArrayList<String> result,String str,int left,int right){
		if(left==0 && right==0){
			result.add(str);
		}
		
		if(left>0){
			helper(result, str+"(", left-1, right);
		}
		
		if(right>0 && left<right){
			helper(result, str+")", left, right-1);
		}
	}
	
	public static ArrayList<String> generateParentheses(int n){
		ArrayList<String> result=new ArrayList<>();
		if(n<=0){
			return result;
		}
		
		helper(result, "", n, n);
		return result;
	}
}

