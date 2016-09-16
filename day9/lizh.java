// todo next “lizhonghao-2016-09-15”
//方法一：n位数产生2^n个格雷码，产生格雷码的公式为(i>>1)^i，其中i为1-2^n中的一个数（循环变量）
// 方法二：当n=1时：格雷码为
//             0
//			   1
//	       当n=2时：格雷码为
//				00
//				01
//				11
//				10
//		  当n=3时，格雷码为
//				000
//				001
//				011
//				010
//				110
//              111
//				101
//				100
//	n位二进制的格雷码是在n-1位格雷码逆序的基础上高位加一位1          	
import java.util.ArrayList;
import java.util.Scanner;

public class GrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			Scanner scan=new Scanner(System.in);
			System.out.print(gray_code_2(scan.nextInt()));
		}

	}
	
	public static ArrayList<Integer> gray_code_1(int n){
		ArrayList<Integer> src=new ArrayList<Integer>();
		
		for(int i=0;i<1<<n;i++){
			src.add((i>>1)^i);
		}
		
		return src;
	}
	
	public static ArrayList<Integer>gray_code_2(int n){
		ArrayList<Integer> src=new ArrayList<>();
		src.add(0);
		
		for(int i=0;i<n;i++){
			int highBit=1<<i;
			int size=src.size();
			for(int j=size-1;j>=0;j--){
				int numbers=src.get(j);
				numbers+=highBit;
				src.add(numbers);
			}
		}
		
		return src;
	}
}


