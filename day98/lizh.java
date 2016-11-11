// todo next “lizhonghao-2016-11-11”
public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mypow(2, 4));
	}
	
	public static double pow(double x,int n){
		if(n==0){
			return 1.0;
		}
		
		if(n==1){
			return x;
		}
		
		double temp=pow(x, n/2);
		if(n%2==0){
			return temp*temp;
		}else{
			return temp*temp*x;
		}
	}
	
	public static double mypow(double x,int n){
		if(x==0){
			return 0.0;
		}
		
		if(n<0){
			return pow(x, -n);
		}else{
			return pow(x, n);
		}
	}
}

