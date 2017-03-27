// todo next “lizhonghao-2016-11-13”
public class PalindromePartitioningTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("min cut number is:"+minCut("aab"));
	}
	
	public static int minCut(String str){
		if(str==null || str.length()==0){
			return 0;
		}
		
		int n=str.length();
		boolean[][] dp=new boolean[n][n];//boolean[i][j]表示下标从i到j的字符串是否为回文
		int[] cut=new int[n];//cut[j]表示下标从0到j的字符串最少可以切割的数量
		
		for(int j=0;j<n;j++){
			cut[j]=j;//cut[j]=j表示下标从0到j的字符串最多可以切割的数量，先赋最大值
			for(int i=0;i<=j;i++){
				if(str.charAt(i)==str.charAt(j) && (j-i<=1 || dp[i+1][j-1])){
					dp[i][j]=true;
					
					if(i>0){
						cut[j]=Math.min(cut[j], cut[i-1]+1);//表示不是从下标0开始的时候最小的cut数，由于[i,j]是回文
					}else{
						cut[j]=0;
					}
				}
			}
		}
		
		return cut[n-1];
	}
}

