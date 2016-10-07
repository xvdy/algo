// todo next “lizhonghao-2016-10-06”
public class LengthOfLastWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs=new String("hello world");
		System.out.println("最后一个单词的长度是："+lengthOfLastWorld_1(strs));
		System.out.println("最后一个单词的长度是："+lengthOfLastWorld_2(strs));
	}
	
	public static int lengthOfLastWorld_1(String strs){
		String[] str=strs.split(" ");
		if (str==null) {
			return 0;
		}
		
		return str[str.length-1].length();
	}
	
	public static int lengthOfLastWorld_2(String strs){
		if(strs.length()==0){
			return 0;
		}
		
		int start=strs.length()-1;
		
		//找出倒数第一个不是空格的字符下标
		while(strs.charAt(start)==' '){
			start--;
		}
		
		int start_tmp=start;
		//System.out.println(start_tmp);
		//找出最后一个单词的第一个字符的下标
		while(strs.charAt(start)!=' '){
			start--;
		}
		
		//System.out.println(start);
		return start_tmp-start;
	}
}

