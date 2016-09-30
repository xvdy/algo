// todo next “lizhonghao-2016-09-29”
public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1，11，21，1211，111221，312211....
		System.out.println("第五个数是："+countAndSay(5));
	}
	
	//要想找到第n个数，需要知道第n-1个数；递归
	public static String countAndSay(int n){
		if(n==0){
			return "";
		}
		
		if(n==1){
			return "1";
		}
		
		int count=1;
		String temp=countAndSay(n-1);
		char last=temp.charAt(0);
		StringBuilder result=new StringBuilder();
		
		for(int j=1;j<temp.length();j++){
			if(temp.charAt(j)==temp.charAt(j-1)){
				count++;
			}else{
				result.append(count);
				result.append(last);
				last=temp.charAt(j);
				count=1;	
			}
		}
		
		result.append(count);
		result.append(last);
		return result.toString();
	}
}

