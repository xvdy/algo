// todo next “lizhonghao-2016-09-17”
import java.util.Arrays;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={1,1,4,3,3};
		System.out.println("single numble is:"+singleNumber_2(numbers));
	}
	
	public static int singleNumber_1(int[] numbers){
		Arrays.sort(numbers);
		int i=0;
		//这个方法有点啰嗦
		for(;i<numbers.length;i+=2){
			if(i!=numbers.length-1){
				if(numbers[i]!=numbers[i+1]){
					return numbers[i];
				}
			}else{
				return numbers[i];
			}
		}
		
		return -1;
	}
	
	//看了别人的讲解后，突然想起来前几天看的位操作符中的异或，首先0与任何数异或结果是本身，异或操作符满足
	//交换律，一个数和自己异或是0
	public static int singleNumber_2(int[] numbers){
		int result=0;
		for(int num:numbers){
			//比如数组中有1,1,4,3,3五个数，循环之后result=1^1^4^3^3=0^4^0=4
			result=result^num;
		}
		
		return result;
	}
}


