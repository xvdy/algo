// todo next “lizhonghao-2017-2-01”
package MicroSoftOneHundredExersizes;

import java.util.LinkedList;
import java.util.List;

public class YueSeFuRing {
	public static int getLastRemainedByList(int n,int m){
		if(n<1 || m<1){
			return -1;
		}
		
		List<Integer> list=new LinkedList<>();
		for(int i=0;i<n;++i){
			list.add(i);
		}
		
		int index=0;
		while(list.size() > 1){
			for(int i=1;i<m;++i){
				index=(index+1) % list.size();
			}
			
			list.remove(index);
		}
		
		return list.get(0);
	}
	
	public static int getLastRemainedByAnalysis(int n,int m){
		if(n<1 || m<1){
			return -1;
		}
		
		int result=0;
		for(int i=2;i<=n;i++){
			result=(result+m) % i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getLastRemainedByList(5,3));
		System.out.println(getLastRemainedByAnalysis(5, 3));
	}
}


