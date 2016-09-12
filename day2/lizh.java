// todo next “lizhonghao-2016-09-12”
import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={8,7,6};
		ArrayList<ArrayList<Integer>> result=permutation(numbers);
		System.out.println(result);
		
	}
	
	public static ArrayList<ArrayList<Integer>> permutation(int[] numbers){
		Arrays.sort(numbers);
		reverse(numbers, 0, numbers.length-1);
		ArrayList<ArrayList<Integer>> src=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> onePermutation=new ArrayList<Integer>();
		int i=0;
		while(i<factorial(numbers.length)){
			nextPermutation(numbers);
			onePermutation=arrayToAraryList(numbers);
			src.add(onePermutation);
			i++;
		}
		return src;
	}
	
	public static void nextPermutation(int[] numbers){
		int i=numbers.length-1;
		// 找出最后一个正序的数,numbers[i-1],numbers[i]
		while(i>0 && numbers[i-1]>numbers[i]){
			i--;
		}
		if(i==0){
			reverse(numbers, 0, numbers.length-1);
		}
		else {
		//找出大于numbers[i-1]最后一个数，，这个数是numbers[j]
		int j=numbers.length-1;
		while(j>=i && numbers[j]<numbers[i-1]){
			j--;
		}
		// 交换numbers[i-1]和numbers[j]
		int temp=numbers[j];
		numbers[j]=numbers[i-1];
		numbers[i-1]=temp;
		//将下标从i至末尾的数逆序
		reverse(numbers,i,numbers.length-1);
		}
	}
	
	public static void reverse(int[] numbers,int start,int end){
		while(start<end){
			int temp=numbers[end];
			numbers[end]=numbers[start];
			numbers[start]=temp;
			start++;
			end--;
		}
	}
	
	public static int factorial(int n){
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	} 
	
	public static ArrayList<Integer> arrayToAraryList(int[] numbers){
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int num:numbers){
			arrayList.add(num);
		}
		return arrayList;
	}
}

