// todo next “lizhonghao-2016-09-24”
public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source=new String("abcdabcdefg");
		String obj=new String("bcd");
		if(strStr(source, obj)==-1){
			System.out.println("目标字符串不在源串中！");
		}else{
			System.out.println("目标字符串在源串中首次出现的下标是:"+strStr(source, obj));
		}
	}
	
	//
	public static int strStr(String source,String obj){
		int s_index=0;
		if(source.length()==0 ||obj.length()==0 ||source.length()-obj.length()<0){
			return -1;
		}
	
		while(s_index <= source.length()-obj.length()){
			int temp=s_index;
			int o_index=0;
			while(source.charAt(temp)==obj.charAt(o_index)){
				temp++;
				o_index++;
				if(o_index==obj.length()-1){
					return s_index;
				}
			}
			
			s_index++;
		}
		
		return -1;
	}
}

