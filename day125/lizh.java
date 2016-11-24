// todo next “lizhonghao-2016-11-24”
public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//123*46=5658
		System.out.println(multiply("123", "46"));
	}
	
	public static String multiply(String str1,String str2){
		String n1=new StringBuilder(str1).reverse().toString();
		String n2=new StringBuilder(str2).reverse().toString();
		
		int[] d=new int[str1.length()+str2.length()];
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				d[i+j]+=(n1.charAt(i)-'0')*(n2.charAt(j)-'0');
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<d.length;i++){
			int mod=d[i]%10;
			int carry=d[i]/10;
			if(i+1<d.length){
				d[i+1]+=carry;
			}
			
			sb.insert(0, mod);
		}
		
		while(sb.charAt(0)=='0' && sb.length()>1){
			sb.deleteCharAt(0);
		}
		
		return sb.toString();
	}
}

