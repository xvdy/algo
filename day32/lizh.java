// todo next “lizhonghao-2016-09-25”

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="11";
		String str2="1";
		System.out.println("相加后结果为："+addBinary(str1, str2));
	}
	
	public static String addBinary(String str1,String str2){
		int str1_length=str1.length();
		int str2_length=str2.length();
		int max=Math.max(str1_length, str2_length);
		String result="";
		int flag=0;
		
		for(int i=0;i<max;i++){
			int m=0;
			int n=0;
			int temp=0;
			
			//从右边依次取出str_1的每一个字符对应的数值，长度不等的高位补0
			if(i<str1_length){
				m=str1.charAt(str1_length-1-i)-'0';
			}else{
				m=0;
			}
			
			if(i<str2_length){
				n=str2.charAt(str2_length-1-i)-'0';
			}else{
				n=0;
			}
			
			temp=m+n+flag;
			flag=temp/2;
			result=temp%2+result;
		}
		
		return flag==1 ? 1+result : result;
	}

}

