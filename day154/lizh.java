// todo next “lizhonghao-2017-02-04”
package MicroSoftOneHundredExersizes;

public class OneInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfOne(8));
	}
	
	public static int numberOfOne(int number){
		int count=0;
		while(number!=0){
			count++;
			number=number & (number-1);
		}
		
		return count;
	}
}


