// todo next “lizhonghao-2016-11-06”
public class UniquePathTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] obstacleGrids={ {0,0,0},
								{0,1,0},
								{0,0,0}};
		System.out.println(uniquePathTwo(obstacleGrids));
	}
	
	public static int uniquePathTwo(int[][] obstacleGrids){
		if(obstacleGrids==null || obstacleGrids.length==0 || obstacleGrids[0].length==0){
			return 0;
		}
		
		int m=obstacleGrids.length;
		int n=obstacleGrids[0].length;
		
		if(obstacleGrids[0][0]==1 || obstacleGrids[m-1][n-1]==1){
			return 0;
		}
		
		int[][] dp=new int[m][n];
		dp[0][0]=1;
		
		for(int i=1;i<n;i++){
			if(obstacleGrids[i][0]==1){
				dp[i][0]=0;
			}else{
				dp[i][0]=dp[i-1][0];
			}
		}
		
		for(int j=1;j<n;j++){
			if(obstacleGrids[0][j]==1){
				dp[0][j]=0;
			}else{
				dp[0][j]=dp[0][j-1];
			}
		}
		
		for(int i=1;i<m;i++){
			for(int j=1;j<m;j++){
				if(obstacleGrids[i][j]==1){
					dp[i][j]=0;
				}else{
					dp[i][j]=dp[i-1][j]+dp[i][j-1];
				}
			}
		}
		
		return dp[m-1][n-1];
	}
}

