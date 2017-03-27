// todo next “lizhonghao-2017-2-03”
package MicroSoftOneHundredExersizes;

public class JumpStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int jumpStair(int n){
		if(n<0){
			return -1;
		}else if(n==1 || n==2){
			return n;
		}else {
			return jumpStair(n-1)+jumpStair(n-2);
		}
	}
	
	public static int jumpStairByIterative(int n){
		if(n<0){
			return -1;
		}else if(n==1 || n==2){
			return n;
		}
		
		int f1=1;
		int f2=2;
		for(int i=3;i<=n;i++){
			f2=f1+f2;
			f1=f2-f1;
		}
		return f2;
	}
}


