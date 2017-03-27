// todo next “lizhonghao-2016-11-05”
public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2行3列的格子时路径有："+uniquePathByDP(2, 3)+"种选择！");

	}
	
	//采用DFS
	public static int dfs(int i,int j,int m,int n){
		if(i==m-1 && j==n-1){
			return 1;
		}
		
		if(i<m-1 && j<n-1){
			return dfs(i+1, j, m, n)+dfs(i, j+1, m, n);
		}
		
		if(i<m-1){
			return dfs(i+1, j, m, n);
		}
		
		if(j<n-1){
			return dfs(i, j+1, m, n);
		}
		
		return 0;
	}
	
	public static int uniquePath(int m,int n){
		return dfs(0, 0, m, n);
	}
	
	//采用DP
	
	public static int uniquePathByDP(int m,int n){
		if(m==0 || n==0){
			return 0;
		}
		
		if(m==1 || n==1){
			return 1;
		}
		
		int[][] dp=new int[m][n];
		for(int i=0;i<n;i++){
			dp[0][i]=1;
		}
		
		for(int j=0;j<m;j++){
			dp[j][0]=1;
		}
		
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		
		return dp[m-1][n-1];
	}
}

