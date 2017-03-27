// todo next “lizhonghao-2017-02-10”
package MicroSoftOneHundredExersizes;

public class MicroThirtySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] str={"abcd","bcde","cdef","klmn"};
        System.out.println(lengthOfNString(str));
	}
	
	public static int lengthOfNString(String[] str){
		int len = str.length;
		int max=0;
		int[][] link = new int[len][len];
		for(int i =0; i != str.length; ++i){
			for(int j = 0; j != str.length; ++j){
				if(isMatch(str[i], str[j])){
					link[i][j] = 1;
				}
			}
		}
		
		for(int i = 0;i !=str.length; ++i){
			for(int j = 0;j != str.length;++j){
				for(int k = 0;k !=str.length; ++k){
					if(link[i][k] != 0 && link[k][j] != 0){
						link[i][j] = link[i][k]+link[k][j];
					}
				}
			}
		}
		
		for(int i = 0;i != str.length;++i){
			for(int j =0;j !=str.length;++j){
				if(link[i][j] > max){
					max = link[i][j];
				}
			}
		}
		
		for(int i = 0;i != str.length;i++){
				if(link[i][i] == 1){
					return -1;
				}
		}
		return str[0].length()+max-1;
	}
	
	
	public static boolean isMatch(String str1,String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i = 1; i != str1.length(); ++i){
			if(str1.charAt(i) != str2.charAt(i-1)){
				return false;
			}
		}
		return true;	
	}
}


