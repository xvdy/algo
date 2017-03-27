// todo next “lizhonghao-2017-02-27”
package MicroSoftOneHundredExersizes;

public class ReorderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{1,2,3,4,5,6};
		for(int num:reOrderArray(arr))
			System.out.print(num+" ");
	}
	
	public static int[] reOrderArray(int[] arr){
		if(arr.length == 0 || arr.length == 1){
			return arr;
		}
		int oddCount = 0,oddBegin = 0;
		int[] tempArr = new int[arr.length];
		for(int i = 0;i < arr.length;++i){
			if(arr[i] % 2 == 1){
				oddCount++;
			}
		}
		for(int i = 0;i < arr.length;++i){
			if(arr[i] % 2 == 1){
				tempArr[oddBegin] = arr[i];
				oddBegin += 1;
			}else{
				tempArr[oddCount] = arr[i];
				oddCount += 1;
			}
		}
		return tempArr;
	}
}


