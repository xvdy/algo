// todo next “lizhonghao-2016-11-27”
import java.util.ArrayList;
public class TextJustifycation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words={"this","is","an","example","of","text","justification."};
		System.out.println(justify(words, 16));

	}
	
	//慢慢研究，先抄上
	public static ArrayList<String> justify(String[] words,int l){
		int wordCount=words.length;
		ArrayList<String> result=new ArrayList<>();
		int curLen=0;
		int lastIndex=0;
		for(int i=0;i<=wordCount;i++){
			if(i==wordCount || curLen+words[i].length()+i-lastIndex>l){
				StringBuilder buf=new StringBuilder();
				int spaceCount=l-curLen;
				int spaceSlots=i-lastIndex-1;
				if(spaceSlots==0 || i==wordCount){
					for(int j=lastIndex;j<i;j++){
						buf.append(words[j]);
						if(j!=i-1){
							appendSpace(buf, 1);
						}
					}
					appendSpace(buf, l-buf.length());
				}else{
					int spaceEach=spaceCount/spaceSlots;
					int spaceExtra=spaceCount%spaceSlots;
					for(int j=lastIndex;j<i;j++){
						buf.append(words[j]);
						if(j!=i-1){
							appendSpace(buf, spaceEach+(j-lastIndex<spaceExtra?1:0));
						}
					}
				}
				
				result.add(buf.toString());
				lastIndex=i;
				curLen=0;
			}
			
			if(i<wordCount){
				curLen+=words[i].length();
			}
		}
		
		return result;
	}
	
	public static void appendSpace(StringBuilder sb,int count){
		for(int i=0;i<count;i++){
			sb.append(" ");
		}
	}
}


