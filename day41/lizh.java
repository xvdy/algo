// todo next “lizhonghao-2016-10-6”
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"lint","intl","inlt","code"};
		System.out.println("anagrams is:"+anagrams(strs));
	}
	
	public static ArrayList<String> anagrams(String[] strs){
		if(strs==null){
			return null;
		}
		
		ArrayList<String> result=new ArrayList<>();
		HashMap<String, ArrayList<String>> map=new HashMap<>();
		
		for(int i=0;i<strs.length;i++){
			char[] temp=strs[i].toCharArray();
			Arrays.sort(temp);
			String str=new String(temp);
			
			if(map.containsKey(str)){
				map.get(str).add(strs[i]);
			}else{
				ArrayList<String> list=new ArrayList<>();
				list.add(strs[i]);
				map.put(str, list);
			}
		}
		
		for(ArrayList<String> tmp:map.values()){
			if(tmp.size()>1){
				result.addAll(tmp);
			}
		}
		
		return result;
	}
}

