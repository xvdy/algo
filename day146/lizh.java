// todo next “lizhonghao-2017-2-01”
package MicroSoftOneHundredExersizes;

import java.util.LinkedHashMap;

public class FirstTimeOccurOnceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstTimeOccurOnceCharacter("aabccdef"));

	}
	
	public static int firstTimeOccurOnceCharacter(String str){
		int pos=-1;
		if(str==null){
			return pos;
		}
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				int count=map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			}else{
				map.put(str.charAt(i), 1);
			}
		}
		
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==1){
				return i;
			}
		}
		
		return pos;
	}

}


