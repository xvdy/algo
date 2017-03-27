// todo next “lizhonghao-2016-11-22”
public class MinimumWindowString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
	}
	
	public static String minWindow(String s,String t){
		int[] count=new int[128];
		// System.out.println(count[0]);
		for(char r:t.toCharArray()){
			count[r]++;
		}
		
		int head=0,min=Integer.MAX_VALUE,total=t.length();
		for(int i=0,j=0;i<s.length();i++){
			if(count[s.charAt(i)]-->0){
				// System.out.println(count[s.charAt(i)]);
				total--;
			}
			
			while(total==0){
				if(i+1-j<min){
					min=i+1-j;
					head=j;
				}
				
				if(++count[s.charAt(j++)]>0){
					total++;
				}
			}
		}
		
		return min==Integer.MAX_VALUE?"":s.substring(head,head+min);
	}
}

