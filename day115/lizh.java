// todo next “lizhonghao-2016-11-17”
public class DecodeWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("123");
		System.out.println("there are "+numbersOfDecodeWays(str)+" ways to decode for "+str);
	}
	
	public static int numbersOfDecodeWays(String str){
		if(str==null || str.length()==0){
			return 0;
		}
		
		int[] numbers=new int[str.length()+1];
		numbers[0]=0;
		numbers[1]=str.charAt(1)!='0'?1:0;
		
		for(int i=2;i<=str.length();i++){
			if(str.charAt(i-1)!='0'){
				numbers[i]=numbers[i-1];
			}
			
			int temp=(str.charAt(i-2)-'0')*10+str.charAt(i-1)-'0';
			if(temp<=26 && temp>=10){
				numbers[i]+=numbers[i-2];
			}
		}
		
		return numbers[str.length()];
	}
}

