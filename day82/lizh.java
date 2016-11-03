// todo next “lizhonghao-2016-11-03”
import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={1,2,3};
		System.out.println(subsetByBinary(numbers));
	}
	
	//递归
	public static void subsetHelper(ArrayList<ArrayList <Integer>> result,
			ArrayList<Integer> list,int[] numbers,int pos){
		result.add(new ArrayList<>(list));
		
		for(int i=pos;i<numbers.length;i++){
			list.add(numbers[i]);
			subsetHelper(result, list, numbers, i+1);
			list.remove(list.size()-1);
		}	
	}
	
	public static ArrayList<ArrayList<Integer>> subsets(int[] numbers){
		ArrayList <ArrayList <Integer>> result=new ArrayList<ArrayList<Integer>>();
		if(numbers==null || numbers.length==0){
			return result;
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		Arrays.sort(numbers);
		
		subsetHelper(result, list, numbers, 0);
		
		return result;
	}
	
	//非递归
	public static ArrayList <ArrayList<Integer>> subsetByBinary(int[] numbers){
		ArrayList <ArrayList<Integer>> result=new ArrayList<ArrayList <Integer>>();
		int n=numbers.length;
		Arrays.sort(numbers);
		
		for(int i=0;i<(1<<n);i++){
			ArrayList<Integer> list=new ArrayList<>();
			
			for(int j=0;j<n;j++){
				if((i & (1<<j)) !=0){
					list.add(numbers[j]);
				}
			}
			
			result.add(list);
		}
		
		return result;
	}
}

