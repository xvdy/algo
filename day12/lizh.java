// todo next “lizhonghao-2016-09-17”
public class Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rate={1,3,2,4,5,2,2};
		System.out.println("所需的糖果数："+numbersOfCandy(rate));

	}
	
	public static int numbersOfCandy(int[] rate){
		int[] result=new int[rate.length];
		int sum=0;
		
		//从左向右扫描，找出当前位置选手满足要求所需的糖果数(和左边选手相比，当前选手满足要求所需的糖果数)
		result[0]=1;
		for(int i=1;i<rate.length;i++){
			if(rate[i]<=rate[i-1]){
				result[i]=1;
			}else{
				result[i]=result[i-1]+1;
			}
		}
		
		//从右向左扫描，找出当前位置选手满足要求的糖果数(和右边选手相比，当前选手满足要求所需的糖果数)
		for(int i=rate.length-2;i>=0;i--){
			if(rate[i]>rate[i+1]){
				//rate[i]<=rate[i+1]那种情况不用考虑，因为在从左向右扫描的过程中已经处理好
				result[i]=Math.max(result[i+1]+1, result[i]);	
			}	
		}
		
		for(int i=0;i<result.length;i++){
			sum+=result[i];
		}
		
		return sum;
	}
}

