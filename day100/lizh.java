// todo next “lizhonghao-2016-11-11”
public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={2,3,1,1,4};
		if(canJump(numbers)){
			System.out.println("can jump to the end!");
		}else{
			System.out.println("can not jump to the end!");
		}

	}
	
	//动态规划：f(i)=max(f(i-1),A[I-1])-1;f(i)代表从0层开始到A[i]时剩下的最大步数
	public static boolean canJump(int[] numbers){
		int[] maxStep=new int[numbers.length];
		maxStep[0]=0;
		
		for(int i=1;i<numbers.length;i++){
			maxStep[i]=Math.max(maxStep[i-1], numbers[i-1])-1;
			if(maxStep[i]<0){
				return false;
			}
		}
		
		return maxStep[numbers.length-1]>=0;
	}
	
	//贪心法
	public static boolean canJumpByGreedy(int[] numbers){
		if(numbers==null || numbers.length==0){
			return false;
		}
		
		int reachable=0;
		for(int i=0;i<numbers.length;i++){
			if(i>reachable){
				return false;
			}
			reachable=Math.max(reachable, i+numbers[i]);
		}
		
		return true;
	}
}

