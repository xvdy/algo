// todo next “lizhonghao-2016-11-26”
import java.util.ArrayList;
public class PascalTrangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pascalTrangle(5));
	}
	
	public static ArrayList<ArrayList<Integer>> pascalTrangle(int numRows){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		
		if(numRows<=0){
			return result;
		}
		
		ArrayList<Integer> pre=new ArrayList<>();
		pre.add(1);
		result.add(pre);
		
		for(int i=2;i<=numRows;i++){
			ArrayList<Integer> cur=new ArrayList<>();
			cur.add(1);
			for(int j=0;j<pre.size()-1;j++){
				cur.add(pre.get(j)+pre.get(j+1));
			}
			cur.add(1);
			
			result.add(cur);
			pre=cur;
		}
		
		return result;
	}
}

