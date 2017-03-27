// todo next “lizhonghao-2016-10-31”
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={1,3,5,6};
		System.out.println(insertPosition(numbers, 2));
	}
	
	public static int insertPosition(int[] numbers,int target){
		int i=0;
		while(numbers[i]<target){
			i++;
		}
		
		return i;
	}
}

