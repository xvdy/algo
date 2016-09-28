// todo next “lizhonghao-2016-09-28”
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=99;
		System.out.println(num+"转为罗马数字为:"+turnIntegerToRoman(num));
	}
	
	public static String turnIntegerToRoman(int num){
		String result="";
		int[]  value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		for(int i=0;num>0;i++){
			while(num>=value[i]){
				num-=value[i];
				result=result+symbol[i];
			}
		}
		
		return result;
	}
}

