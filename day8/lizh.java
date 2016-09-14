// todo next “lizhonghao-2016-09-14”
// 这道算法题和菲波那切数列数列的思路有点类似，只不过初始值不同；也可以看做是DP问题
//动态转移方程：f[n]=f[n-1]+f[n-2],f[n]代表爬n阶楼梯总共有的方法数，其中f[1]=1,f[2]=2

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			System.out.println("爬第"+i+"层楼梯总共有"+numbers_of_ways(i)+"种方法");
		}

	}
	
	public static int numbers_of_ways(int n){
		int f1=1;
		int f2=2;
		int fn=0;
		if(n==1){
			return f1;
		}else if(n==2){
			return f2;
		}
		
		for(int i=3;i<=n;i++){
			fn=f1+f2;
			f1=f2;
			f2=fn;
		}
		
		return fn;
	}
}
