// todo next “lizhonghao-2017-02-27”
package MicroSoftOneHundredExersizes;

public class MinNumberInRotatedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,1,2,3,4};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr){
		if(arr.length == 0){
			return -1;
		}
		int low = 0;
		int high = arr.length-1;
		while(low < high){
			int mid = low + (high-low)/2;
			if(arr[mid] > arr[high]){
				low =mid + 1;
			}else if(arr[mid] == arr[high]){
				high -= 1;
			}else{
				high = mid;
			}
		}
		return arr[low];
	}
}


