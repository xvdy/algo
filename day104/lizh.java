// todo next “lizhonghao-2016-11-12”
import java.util.HashSet;
import java.util.Set;
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("abcabcbb");
		System.out.println("longest substring without repeating characters："+longthOfLongestSubstring(str));
		System.out.println("longest substring without repeating characters："+lengthOfLongestSubstringBySlideWindow(str));
	}
	
	//直接方法
	public static boolean isUnique(String str,int start,int end){
		Set<Character> set=new HashSet<>();
		for(int i=start;i<=end;i++){
			if(set.contains(str.charAt(i))){
				return false;
			}
			
			set.add(str.charAt(i));
		}
		
		return true;
	}
	
	public static int longthOfLongestSubstring(String str){
		int n=str.length();
		int length=0;
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(isUnique(str, i, j)){
					length=Math.max(length, j-i+1);
				}
			}
		}
		
		return length;
	}
	
	//滑窗
	public static int lengthOfLongestSubstringBySlideWindow(String str){
		int n=str.length();
		Set<Character> set=new HashSet<>();
		int length=0,i=0,j=0;
		while(i<n && j<n){
			if(!set.contains(str.charAt(j))){
				set.add(str.charAt(j++));
				length=Math.max(length, j-i);
			}else{
				set.remove(str.charAt(i++));
			}
		}
		
		return length;
	}
}

