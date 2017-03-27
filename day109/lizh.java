// todo next “lizhonghao-2016-11-14”
public class MaxRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] martrix={{'1','1','0','0','1'},
						  {'0','1','0','0','1'},
						  {'0','0','1','1','1'},
						  {'0','0','1','1','1'},
						  {'0','0','1','1','1'}};
		System.out.println("maximum area is:"+maximalRectangle(martrix));
	}
	
	
	//dp[i][j]表示从[i][j]开始行上1的个数
	public static int maximalRectangle(char[][] martrix){
		int m=martrix.length;
		if(m<1){
			return 0;
		}
		
		int n=martrix[0].length;
		int[][] dp=new int[m][n];
		
		for(int i=0;i<m;i++){
			dp[i][n-1]=(martrix[i][n-1]=='0')?0:1;
			for(int j=n-2;j>=0;j--){
				dp[i][j]=(martrix[i][j]=='0')?0:(1+dp[i][j+1]);
			}
		}
		
		int maxArea=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				int width=dp[i][j];
				
				for(int k=i;k<m && width>0;k++){
					width=Math.min(width, dp[k][j]);//计算面积时两行中以少的作为宽度
					//System.out.println(width);
					maxArea=Math.max(maxArea, width*(k-i+1));
				}
			}
		}
		
		return maxArea;
	}
}

