// todo next “lizhonghao-2016-10-16”
public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3个元素时BST的个数："+numbersOfBinaryTrees(3));

	}
	
	//f(n)=∑f(i)*f(n-1-i);i从0到i-1
	public static int numbersOfBinaryTrees(int n){
		int[] count=new int[n+1];
		count[0]=1;
		count[1]=1;
		
		for(int i=2;i<=n;i++){
			for(int j=0;j<=i-1;j++){
				count[i]+=count[j]*count[i-1-j];
			}
		}
		
		return count[n];
	}
}

