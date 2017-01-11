// todo next “lizhonghao-2017-1-11”
package MicroSoftOneHundredExersizes;

public class ReverseWordsInTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("hello every one!   ");
		System.out.println(reverseWordsInTheSemntence(s));
	}
	
	public static String reverseWordsInTheSemntence(String str){
		if(str==null || str.length()==0 || "".equals(str.trim())){
			return str;
		}
		
		String[] temp=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=temp.length-1;i>=0;i--){
			sb.append(temp[i]+" ");
		}
		
		return sb.toString().substring(0, sb.toString().length()-1);
	}
}


