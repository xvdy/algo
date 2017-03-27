// todo next “lizhonghao-2017-02-08”
package MicroSoftOneHundredExersizes;

public class GetOneFromOneToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getOneFromOneToN_1(12));
		System.out.println(getOneFromOneToN_2(12));
		System.out.println(getOneFromOneToN_3(12));
	}
	
	//方法一
	public static int getOneFromOneToN_1(int n){
		if(n<1){
			return 0;
		}
		int count=0;
		StringBuffer str=new StringBuffer();
		for(int i=1;i!=n+1;++i){
			str.append(i);
		}
		
		String s=str.toString();
		for(int i=0;i<s.length();++i){
			if(s.charAt(i)=='1'){
				count++;
			}
		}
		
		return count;
	}
	
	//方法2
	public static int getOneFromOneToN_2(int n){
		if(n<1){
			return 0;
		}
		
		int count=0;
		for(int i=1;i!=n+1;++i){
			count +=get1Num(i);
		}
		
		return count;
	}
	public static int get1Num(int n){
		int res=0;
		while(n!=0){
			if(n % 10 == 1){
				res++;
			}
			
			n /=10;
		}
		
		return res;
	}
	
	//方法3
	public static int getOneFromOneToN_3(int n){
		if(n<1){
			return 0;
		}
		
		int len=getLenOfN(n);
		if(len==1){
			return 1;
		}
		int temp=powerBaseOfTen(len-1);
		int highBit=n/temp;
		int oneInHighBit=highBit==1?n % temp +1:temp;
		int oneInRemainedBit=highBit*(len-1)*(temp/10);
		
		return oneInHighBit+oneInRemainedBit+getOneFromOneToN_3(n % temp);
	}
	public static int getLenOfN(int n){
		int len=0;
		while(n!=0){
			len++;
			n /=10;
		}
		return len;
	}
	public static int powerBaseOfTen(int n){
		return (int) Math.pow(10, n);
	}
}


