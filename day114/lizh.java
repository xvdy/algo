// todo next “lizhonghao-2016-11-18”
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minEditDistance("mart", "karma"));
	}
	
	public static int minEditDistance(String str1,String str2){
		int m=str1.length();
		int n=str2.length();
		
		int[][] dp=new int[m+1][n+1];
		for(int i=0;i<m+1;i++){
			dp[i][0]=i;
		}
		for(int j=0;j<n+1;j++){
			dp[0][j]=j;
		}
		
		for(int i=1;i<m+1;i++){
			for(int j=1;j<n+1;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1];
				}else{
					dp[i][j]=Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+1;
				}
			}
		}
		
		return dp[m][n];
	}
}

