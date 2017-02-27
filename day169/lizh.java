// todo next “lizhonghao-2017-02-27”
package MicroSoftOneHundredExersizes;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(16, -3));
		System.out.println(solution(16, -3));
	}
	
	public static double power(double base,int exponent){
		double result = 1;
		for(int i = 0;i < Math.abs(exponent);++i){
			result *=base;
		}
		return exponent < 0? 1/result:result;	
	}
	public static double solution(double base,int exponent){
		double result = 1.0;
		int index = Math.abs(exponent);
		while(index != 0){
			if((index & 1) != 0){
				result *= base;
			}
			base *= base;
			index = index >> 1;
		}
		return exponent < 0? 1/result:result;	
	}
}


