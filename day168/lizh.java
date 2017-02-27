// todo next “lizhonghao-2017-02-27”
package MicroSoftOneHundredExersizes;

public class NumberOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solutionByBitAnd(5));
		System.out.println(solutionByBitMove(5));
	}
	
	public static int solutionByBitMove(int n){
		int count = 0;
		int flag = 1;
		while(flag != 0){
			if((flag & n) != 0){
				count++;
			}
			flag = flag << 1;
		}
		return count;
	}
	
	public static int solutionByBitAnd(int n){
		int count = 0;
		while(n != 0){
			count++;
			n = n & (n-1);
		}
		return count;		
	}
}


