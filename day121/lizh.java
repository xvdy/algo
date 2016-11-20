// todo next “lizhonghao-2016-11-20”
public class PalindromeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPalinddromeNumber(1221)){
			System.out.println("is palindrome number!");;
		}else{
			System.out.println("is not palindrome number!");
		}
	}
	
	public static boolean isPalinddromeNumber(int x){
		if(x<0){
			return false;
		}
		
		//获得与x同位数的被除数，用于分离x左边的数字
		int div=1;
		while(x/div > 10){
			div *= 10;
		}
		
		while(x!=0){
			int left=x/div;
			int right=x%10;
			
			if(left!=right){
				return false;
			}
			
			//更新x和div
			x=(x % div)/10;
			div/=100;
		}
		
		return true;
	}
}


