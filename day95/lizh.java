// todo next “lizhonghao-2016-11-08”
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={10,1,2,7,6,1,5};
		System.out.println(combinationSum(numbers, 8));
	}
	
	public static void helper(int[] numbers,int target,int start,ArrayList<Integer> curr,ArrayList<ArrayList <Integer>> result){
		if(target==0){
			ArrayList<Integer> temp=new ArrayList<>(curr);
			if(!result.contains(temp)){
				result.add(temp);
				return;
			}
		}
		
		for(int i=start;i<numbers.length;i++){
			if(target<numbers[i]){
				return;
			}
			
			curr.add(numbers[i]);
			helper(numbers, target-numbers[i], i+1, curr, result);
			curr.remove(curr.size()-1);
		}
	}
	
	public static ArrayList<ArrayList<Integer>> combinationSum(int[] numbers,int target){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> curr=new ArrayList<>();
		
		if(numbers==null || numbers.length==0){
			return result;
		}
		
		Arrays.sort(numbers);
		helper(numbers, target, 0, curr, result);
		
		return result;
	}
}

