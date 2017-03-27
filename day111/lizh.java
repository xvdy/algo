// todo next “lizhonghao-2016-11-16”
public class InterleavingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("aabcc");
		String s2=new String("dbbca");
		String s3=new String("aadbbcbcac");
		if(isInterLeave(s1, s2, s3)){
			System.out.println("can match!");
		}else{
			System.out.println("can not match!");
		}
	}
	
	public static boolean isInterLeave(String s1,String s2,String s3){
		if(s1.length()+s2.length()!=s3.length()){
				return false;
			}
			
			//dp[i][j]表示s1中i个字符，s2中j个字符能否可以匹配s3中的i+j个字符；
			boolean[][] dp=new boolean[s1.length()+1][s2.length()+1];
			dp[0][0]=true;
			
			for(int i=1;i<=s1.length();i++){
				if(s3.charAt(i-1)==s1.charAt(i-1) && dp[i-1][0]){
					dp[i][0]=true;
				}
			}
			
			for(int j=1;j<=s2.length();j++){
				if(s3.charAt(j-1)==s2.charAt(j-1) && dp[0][j-1]){
					dp[0][j]=true;
				}
			}
			
			//可以匹配的条件是s1中第i个字符和s3中的第i+j个字符可以匹配，并且s1中前i-1个字符和s2中的j个字符和
			//和s3中的前i+j-1个字符也可以匹配，s2中的情况和s1中的情况类似。
			for(int i=1;i<=s1.length();i++){
				for(int j=1;j<=s2.length();j++){
					if(s3.charAt(i+j-1)==s1.charAt(i-1) && dp[i-1][j] ||
					   s3.charAt(i+j-1)==s2.charAt(j-1) && dp[i][j-1]){
						dp[i][j]=true;
					}
				}
			}
			
			return dp[s1.length()][s2.length()];
	}
}


