// todo next “lizhonghao-2016-11-04”
import java.util.ArrayList;
public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(partion("aab"));
	}
	
	public static boolean isPalindrome(String str){
		int low=0;
		int high=str.length()-1;
		
		while(low<high){
			if(str.charAt(low)!=str.charAt(high)){
				return false;
			}
			
			low++;
			high--;
		}
		return true;
	}
	
	public static void addPalindrome(String str,int start,ArrayList<String> list,
									ArrayList<ArrayList<String>> result){
		if(start==str.length()){
			result.add(new ArrayList<String>(list));
			return ;
		}
		
		for(int i=start+1;i<=str.length();i++){
			String subString=str.substring(start, i);
			
			if(isPalindrome(subString)){
				list.add(subString);
				addPalindrome(str, i, list, result);
				list.remove(list.size()-1);
			}
		}	
	}
	
	public static ArrayList<ArrayList<String>> partion(String str){
		ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		
		if(str==null || str.length()==0){
			return result;
		}
		
		ArrayList<String> list=new ArrayList<>();
		addPalindrome(str, 0, list, result);
		
		return result;
	}	
}

