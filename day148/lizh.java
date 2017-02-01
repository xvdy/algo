// todo next “lizhonghao-2017-2-01”
package MicroSoftOneHundredExersizes;

public class FibArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int fibByRecursive(int n){
		if(n<=1){
			return n;
		}else{
			return fibByRecursive(n-1)+fibByRecursive(n-2);
		}
	}
	
	public static int fibByIterative(int n){
		int result=0;
		int f1=0;
		int f2=1;
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		
		for(int i=2;i<=n;i++){
			result=f1+f2;
			f1=f2;
			f2=result;
		}
		
		return result;	
	}
	
	public static int fibBy(int n){
		if(n<=0){
			return 0;
		}
		
		if(n==1 || n==2){
			return 1;
		}
		
		int f1=1;
		int f2=1;
		while(n-- > 2){
			f1=f1+f2;
			f2=f1-f2;
		}
		
		return f1;
	}
}


