// todo next “lizhonghao-2016-11-12”
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] triangle={{2},
						{3,4},
						{6,5,7},
						{4,1,8,3}};
		System.out.println("maxmum path is:"+maximumTotalPath(triangle));
	}
	
	//自底向上的DP,f[x][y]=triangle[x][y]+Math.min(f[x+1][y+1],f[x+1][y]),f[x][y]表示从底部到[x][y]处的最小路径
    //注意自底向上和自顶向下这两种方法初值的设定方式
	public static int maximumTotalPath(int[][] triangle){
		if(triangle==null || triangle.length==0){
			return -1;
		}
		
		if(triangle[0]==null || triangle[0].length==0){
			return -1;
		}
		
		int n=triangle.length;
		int[][] f=new int[n][n];
		
		for(int i=0;i<n;i++){
			f[n-1][i]=triangle[n-1][i];
		}
		
		for(int i=n-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				f[i][j]=Math.min(f[i+1][j], f[i+1][j+1])+triangle[i][j];
			}
		}
		
		return f[0][0];
	}
}

