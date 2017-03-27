// todo next “lizhonghao-2017-1-27”
package MicroSoftOneHundredExersizes;

public class FindAPairOfValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number={1,2,3,4,5};
		findPairInArray(number, 6);
	}
	
	public static void findPairInArray(int[] number,int val){
		int first=0;
		int last=number.length-1;
		int sum=number[first]+number[last];
		
		while(first<last && sum!=val){
			if(sum<val){
				first++;
			}else{
				last--;	
			}
			sum=number[first]+number[last];
		}
		
		if(first<last){
			System.out.println("寻找的数对是："+number[first]+" 和 "+number[last]);
		}else{
			System.out.println("不存在两个数等于给定的值！");
		}
	}
}


