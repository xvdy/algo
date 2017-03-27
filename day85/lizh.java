// todo next “lizhonghao-2016-11-03”
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterCombinationForPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinationForPhoneNumber("23"));

	}
	
	public static void helper(Map<Character, char[]> map,String digit,
			StringBuilder sb,ArrayList<String> result){
		
		if(sb.length()==digit.length()){
			result.add(sb.toString());
			return;
		}
		
		for(char c:map.get(digit.charAt(sb.length()))){
			sb.append(c);
			helper(map, digit, sb, result);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	
	public static ArrayList<String> letterCombinationForPhoneNumber(String digit){
		ArrayList<String> result=new ArrayList<>();
		
		if(digit==null || digit.equals("")){
			return result;
		}
		
		Map<Character, char[]> map=new HashMap<Character,char[]>();
		map.put('0', new char[] {});
		map.put('1', new char[] {});
		map.put('2',new char[] {'a','b','c'});
		map.put('3', new char[] {'d','e','f'});
		map.put('4', new char[] {'g','h','i'});
		map.put('5', new char[] {'j','k','l'});
		map.put('6', new char[] {'m','n','o'});
		map.put('7', new char[] {'p','q','r','s'});
		map.put('8', new char[] {'t','u','v'});
		map.put('9', new char[] {'w','x','y','z'});
		
		StringBuilder sb=new StringBuilder();
		helper(map, digit, sb, result);
		
		return result;
	}
}

