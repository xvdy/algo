// todo next “lizhonghao-2016-09-12”
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		while(true){
		Scanner scan=new Scanner(System.in);
		System.out.println("输出为:"+delThree(scan.next()));
		}
	}
	
	public static String delThree(String s){
		String temp=s.substring(0, 1);
		for(int i=1;i<s.length();i++){
			if (temp.substring(temp.length()-1, temp.length()).equals(s.substring(i, i+1))){
				temp+=s.substring(i, i+1);	
			}
			else{
				if(temp.length()>=3){
					s=s.substring(0, i-temp.length())+s.substring(i, s.length());
					return delThree(s);
				}
				temp=s.substring(i, i+1);
			}	
		}
		return s;
	}
}


