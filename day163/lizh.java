// todo next “lizhonghao-2017-02-16”
package MicroSoftOneHundredExersizes;

public class ChangeBlankToGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changeToGivenString(new StringBuffer("I am happy!")));
	}
	
	public static String changeToGivenString(StringBuffer str){
		String temp = str.toString();
		StringBuffer result = new StringBuffer();
		if(temp == null){
			System.out.println("input string is invlaid!");
		}
		for(int i=0;i<temp.length();++i){
			if(temp.charAt(i) == ' '){
				result.append("20%");
			}else{
				result.append(temp.charAt(i));
			}
		}
		return result.toString();
	}
}


