// todo next “lizhonghao-2016-11-18”
import java.util.HashSet;
import java.util.Set;
public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="leetcode";
		Set<String> dict=new HashSet<>();
		dict.add("leet");
		dict.add("code");
		if(wordBreak(str, dict)){
			System.out.println(" word can be segmented by dictionary!");
		}else{
			System.out.println("word can not be segmented by dictionary!");
		}
	}
	
	//flag[i]表示str中下标为0-i的字符串能否由字典元素构成
	public static boolean wordBreak(String str,Set<String> dict){
		boolean[] flag=new boolean[str.length()+1];
		flag[0]=true;
		
		for(int i=0;i<str.length();i++){
			if(!flag[i]){
				continue;
			}
			
			for(String element:dict){
				int len=element.length();
				int end=i+len;
				if(end>str.length()){
					continue;
				}
				
				if(flag[end]){
					continue;
				}
				
				if(str.substring(i,end).equals(element)){
					flag[end]=true;
				}
			}
		}
		
		return flag[str.length()];
	}
}


