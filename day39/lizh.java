// todo next “lizhonghao-2016-09-29”
import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("XCIX");
		System.out.println(str+"转换为二进制后是："+turnRomanToInteger(str));
	}
	
	public  static int turnRomanToInteger(String str){
		HashMap<Character, Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result=0;
		
		result+=map.get(str.charAt(str.length()-1));
		for(int j=str.length()-2;j>=0;j--){
			if(map.get(str.charAt(j))>=map.get(str.charAt(j+1))){
				result+=map.get(str.charAt(j));
			}else{
				result-=map.get(str.charAt(j));
			}
		}
		
		return result;
	} 
}

