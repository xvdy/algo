// todo next
public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={8,6,5};
		nextPermutation(a);
		for(int num:a){
		System.out.print(num+" ");
		}

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
	
}
