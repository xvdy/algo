// todo next “lizhonghao-2016-11-12”
public class JumpGameTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={2,3,1,1,4};
		System.out.println("least steps is:"+jumpNumbersByDP(numbers));
	}
	
	public static int  jumpNumbers(int[] numbers) {
		int jumps=0,curEnd=0,curFarthest=0;
		if(numbers.length==0){
			return -1;
		}
		
		for(int i=0;i<numbers.length;i++){
			curFarthest=Math.max(curFarthest, i+numbers[i]);
			if(i==curEnd){
				jumps++;
				curEnd=curFarthest;
				
				if(curEnd>=numbers.length-1){
					break;
				}
			}
		}
		
		return jumps;
	}
	
	//DP:steps[i]=min(steps[i],steps[j]+1)；steps[i]表示从0到i所需的最小步数
	public static int jumpNumbersByDP(int[] numbers){
		if(numbers.length==0){
			return -1;
		}
		
		int[] steps=new int[numbers.length];
		steps[0]=0;
		for(int i=1;i<numbers.length;i++){
			steps[i]=Integer.MAX_VALUE;
		}
		
		for(int i=1;i<numbers.length;i++){
			for(int j=0;j<i;j++){
				if(steps[j]!=Integer.MAX_VALUE && j+numbers[j]>=i){
					steps[i]=Math.min(steps[i], steps[j]+1);
				}
			}
		}
		
		return steps[numbers.length-1];
	}
}

