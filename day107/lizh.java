// todo next “lizhonghao-2016-11-13”
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("最大子数组的和是："+maxSubarray(numbers));

	}
	
	//DP 状态转移方程是f(x)=max{numbers[i],numbers[i]+sum[i-1]},f(i)表示前i个元素子数组的和，
	//max(f(x))即为数组中所有元素最大的子数组的和
	public static int maxSubarray(int[] numbers){
		if(numbers==null || numbers.length==0){
			return 0;
		}
		
		int max=numbers[0];
		int[] sum=new int[numbers.length];
		sum[0]=numbers[0];
		
		for(int i=1;i<numbers.length;i++){
			sum[i]=Math.max(numbers[i], sum[i-1]+numbers[i]);
			max=Math.max(max, sum[i]);
		}
		
		return max;
	}
	
	//
	public static int maxSubarrayByKadane(int[] numbers){
		if(numbers==null || numbers.length==0){
			return 0;
		}
		
		int maxEnd=0;
		int maxSoFar=Integer.MIN_VALUE;
		
		for(int i=0;i<numbers.length;i++){
			if(maxEnd<0){
				maxEnd=0;
			}
			
			maxEnd+=numbers[i];
			maxSoFar=Math.max(maxSoFar,maxEnd);
		}
		
		return maxSoFar;
	}
}

