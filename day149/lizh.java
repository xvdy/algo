// todo next “lizhonghao-2017-2-01”
package MicroSoftOneHundredExersizes;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(strToInt("+12348"));
	}
	
	public static int strToInt(String str){
		if(str==null || str.length()==0){
			return 0;
		}
		
		int result=0;
		boolean flag=true;
		if(str.charAt(0)=='-'){
			flag=false;
		}
		
		for(int i=0;i<str.length();++i){
			if(i==0 && (str.charAt(i)=='-' || str.charAt(i)=='+')){
				continue;
			}
			if(str.charAt(i)<'0' || str.charAt(i)>'9'){
				return 0;
			}
			result=result*10 + str.charAt(i)-'0';
		}
		
		return flag?result:(0-result); 
	}
}


