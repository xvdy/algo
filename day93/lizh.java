// todo next “lizhonghao-2016-11-07”
import java.util.ArrayList;

public class ReStoreIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(restoreIPAddress("25525511135"));
	}
	
	
	//妈的，深度优先搜索递归深度真深啊，一步一步回溯用了好几张纸。。。，目测这个题好多别的答案是错的
	public static boolean isValid(String s){
		if(s.charAt(0)=='0'){
			return s.equals("0");
		}
		
		int num=Integer.parseInt(s);
		return num>=0 && num<=255;
	}
	
	public static void helper(ArrayList<String> result,ArrayList<String> list,String s,int start){
		if(list.size()==4){
			if(start!=s.length()){
				return;
			}
			
			StringBuilder sb=new StringBuilder();
			for(String tmp:list){
				sb.append(tmp);
				sb.append(".");
			}
			
			sb.deleteCharAt(sb.length()-1);
			result.add(sb.toString());
			return;
		}
		
		for(int i=start;i<s.length() && i<start+3;i++){
			String tmp=s.substring(start,i+1);
			if(isValid(tmp)){
				list.add(tmp);
				helper(result, list, s, i+1);
				list.remove(list.size()-1);
			}
		}
	}
	
	public static ArrayList<String> restoreIPAddress(String s){
		ArrayList<String> result=new ArrayList<>();
		ArrayList<String> list=new ArrayList<>();
		
		if(s.length()<4 || s.length()>12){
			return result;
		}
		
		helper(result, list, s, 0);
		return result;
	}	
}

