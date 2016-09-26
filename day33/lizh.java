// todo next “lizhonghao-2016-09-25”
public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("abcdzdcab");
		System.out.println("最长回文是："+longestPlalindromeSubString(str));
	}
	
	public static String longestPlalindromeSubString(String str){
		if(str==null){
			return null;
		}
		
		int maxLength=0;
		String longestPalindrome="";
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				String temp=str.substring(i, j+1);
				if(isPalindrome(temp)){
					if(temp.length()>maxLength){
						maxLength=temp.length();
						longestPalindrome=temp;
					}
				}
			}
		}
		
		return longestPalindrome;
	}
	
	public static boolean isPalindrome(String str){
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;
			}
		}
		
		return true;
	}

}

