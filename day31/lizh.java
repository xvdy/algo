// todo next “lizhonghao-2016-09-25”
public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String(" -99234566 ");
		System.out.println("字符串变为数字后为："+stoi(str));

	}
	
	public static int stoi(String str){
		if(str==null){
			return 0;
		}
		
		str=str.trim();
		if(str.length()==0)
			return 0;
		
		char flag='+';
		if(str.charAt(0)=='-'){
			flag='-';
		}
		
		double result=0;
		int i=1;
		while(i<str.length() && str.charAt(i)>='0' &&str.charAt(i)<='9'){
			result=result*10+str.charAt(i)-'0';
			i++;
		}
		
		if(flag=='-')
			result=-result;
		if(result>Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(result<Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return (int) result;
	}

}

