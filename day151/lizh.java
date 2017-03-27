// todo next “lizhonghao-2017-02-03”
package MicroSoftOneHundredExersizes;

public class LargestLengthNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestLengthNumbers("abcd12345ed125ss123456789"));
	}
	
	public static int longestLengthNumbers(String str){
		if(str==null || str.length()==0){
			return 0;
		}
		
		int len=str.length();
		int max=0;
		int[] dp=new int[len];
		
		if(str.charAt(0)>='0' && str.charAt(0)<='9'){
			dp[0]=1;
		}
		for(int i=1;i<len;++i){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				dp[i]=dp[i-1]+1;
			}else{
				dp[i]=0;
			}
		}
		
		for(int i=0;i<dp.length;++i){
			if(dp[i]>max){
				max=dp[i];
			}
		}
		return max;
	}
}


