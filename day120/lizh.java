// todo next “lizhonghao-2016-11-20”
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(reverseInteger(-214));
	}
	
	public static int reverseInteger(int x){
		long result=0;
		int x_abs=Math.abs(x);
		while(x_abs!=0){
			result=result*10+x_abs%10;
			x_abs/=10;
		}
		
		if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
			return 0;
		}else{
			return x>0?(int) result:-(int) result;
		}
	}
}


