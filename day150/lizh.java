// todo next “lizhonghao-2017-2-03”
package MicroSoftOneHundredExersizes;

import java.util.LinkedList;
import java.util.List;

public class SumToM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumToM(10, 8);
	}
	
	public static LinkedList<Integer> list=new LinkedList<>();
	public static void sumToM(int m,int n){
		if(m<n){
			n=m;
		}
		
		if(m==0){
			display(list);
			return;
		}
		
		if(m<0 || n<=0){
			return;
		}
		
		list.push(n);
		sumToM(m-n, n-1);
		list.pop();
		sumToM(m, n-1);	
	}
	
	public static void display(List<Integer> list){
		System.out.println(list);
	}
}


