// todo next “lizhonghao-2016-09-27”
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"ABCDEFG","ABCEF","ABC"};
		System.out.println("最长公共前缀为："+longestCommonPrefix(str));
	}
	
	public static String longestCommonPrefix(String[] str){
		if(str.length==0){
			return "";
		}
		
		//取出数组的第一个元素，然后取出第一个元素的逐个字符和数组中后面的元素相应的字符比较
		int length=str.length;
		int j=0;
		while(j<str[0].length()){
			char temp=str[0].charAt(j);
			for(int i=1;i<length;i++){
				if(temp!=str[i].charAt(j)){
					return str[0].substring(0, j);
				}
			}
			
			j++;
		}
		
		return str[0];
	} 
}

