// todo next “lizhonghao-2016-11-03”
import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers={1,2,2};
        System.out.println(subsets(numbers));
	}
	
	public static void helper(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list,
			int[] numbers,int pos){
		result.add(new ArrayList<Integer>(list));
		
		for(int i=pos;i<numbers.length;i++){
			if(pos!=i && numbers[i]==numbers[i-1]){
				continue;
			}
			
			list.add(numbers[i]);
			helper(result, list, numbers, i+1);
			list.remove(list.size()-1);
		}
	}
	
	public static ArrayList<ArrayList<Integer>> subsets(int[] numbers){
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<>();
		
		if(numbers==null || numbers.length==0){
			return result;
		}
		
		Arrays.sort(numbers);
		helper(result, list, numbers, 0);
		
		return result;
	}
}

