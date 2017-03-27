// todo next “lizhonghao-2016-11-03”
import java.util.ArrayList;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(combination(4, 2));
	}
	
	public static void helper(int n,int k,int start,ArrayList<Integer> list,ArrayList <ArrayList<Integer>> result){
		if(list.size()==k){
			result.add(new ArrayList<>(list));
			return;
		}
		
		for(int i=start;i<=n;i++){
			list.add(i);
			helper(n, k, i+1, list, result);
			list.remove(list.size()-1);
		}
	}
	
	public static ArrayList <ArrayList <Integer>> combination(int n,int k){
		ArrayList<ArrayList <Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<>();
		
		if(n<=0 || n<k){
			return result;
		}
		
		helper(n, k, 1, list, result);
		
		return result;
	}
}


