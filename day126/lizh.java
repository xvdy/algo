// todo next “lizhonghao-2016-11-24”
import java.util.ArrayList;
import java.util.HashMap;
public class SubstringWithConcatenationWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("barfoothefoobarman");
		String[] words={"bar","foo"};
		System.out.println(findSubstring(str, words));
	}
	
	public static ArrayList<Integer> findSubstring(String str,String[] words){
		HashMap<String, Integer> toFind=new HashMap<>();
		HashMap<String, Integer> found=new HashMap<>();
		ArrayList<Integer> result=new ArrayList<>();
		int wordsLength=words.length;
		int singleWordsLength=words[0].length();
		
		for(int i=0;i<words.length;i++){
			if(!toFind.containsKey(words[i])){
				toFind.put(words[i], 1);
			}else{
				toFind.put(words[i], toFind.get(words[i])+1);
			}
		}
		
		for(int i=0;i<=str.length()-singleWordsLength*wordsLength;i++){
			found.clear();
			int j;
			for(j=0;j<wordsLength;j++){
				int k=i+j*singleWordsLength;
				String strSub=str.substring(k, singleWordsLength+k);
				if(!toFind.containsKey(strSub)) break;
				
				if(!found.containsKey(strSub)){
					found.put(strSub, 1);
				}else{
					found.put(strSub, found.get(strSub)+1);
				}
				
				if(found.get(strSub)>toFind.get(strSub)) break;
					
			}
			
			if(j==wordsLength){
				result.add(i);
			}
		}
		
		return result;
	}
}


