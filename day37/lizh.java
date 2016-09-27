// todo next “lizhonghao-2016-09-27”
public class ValidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"0","0.1","abc","1a","2e10"};
		for(int i=0;i<str.length;i++){
			if(validNumber(str[i])){
				System.out.println(str[i]+"是数字");
			}else{
				System.out.println(str[i]+"不是数字");
			}
		}	
	}
	
	public static boolean validNumber(String str){
		String temp=str.replaceAll("[a-df-zA-Z]", "#");
		if(temp.lastIndexOf('#')>0){
			return false;
		}
		
		return true;
	}
}

