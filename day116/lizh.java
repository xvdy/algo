// todo next “lizhonghao-2016-11-18”
public class DistinctSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(distinctSequenceNumber("rabbbit", "rabbit"));
	}
	
	public static int distinctSequenceNumber(String S,String T){
		if(S==null || T==null){
			return 0;
		}
		
		int[][] dp=new int[S.length()+1][T.length()+1];
		for(int i=0;i<=S.length();i++){
			dp[i][0]=1;
		}
		
		for(int i=1;i<=S.length();i++){
			for(int j=1;j<=T.length();j++){
				if(S.charAt(i-1)==T.charAt(j-1)){
					dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
				}else{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		
		return dp[S.length()][T.length()];
	}
}


