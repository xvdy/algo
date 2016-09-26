// todo next “lizhonghao-2016-09-24”

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("A man,a plan,a canal:Panama");
		if(isPalindrome(s)){
			System.out.println(s+" 是回文");
		}else{
			System.out.println(s+" 不是回文");
		}
	}
	// 主要是标点符号的处理方式，它不在比较的范围内
	//这个算法采用正则表达式，先把标点符号过滤以后再处理
	public static boolean isPalindrome(String s){
		if(s==null || s.length()==1){
			return true;
		}
		
		String temp=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		//System.out.println(temp);
		int start=0;
		int end=temp.length()-1;
		while(temp.charAt(start)==temp.charAt(end)){
			start++;
			end--;
			if(start>=end){
				return true;
			}
		}
		
		return false;
	}
}


