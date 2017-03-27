// todo next “lizhonghao-2016-10-31”
public class SearchForRange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={5,7,7,8,8,10};
		for(int index:searchRange(numbers, 8)){
			System.out.print(index+" ");
		}
	}
	
	public static void binarySearch(int[] numbers,int left,int right,int target,int[] arr){
		if(left>right){
			return ;
		}
		
		if(numbers[left]==numbers[right] && target==numbers[left]){
			arr[0]=left;
			arr[1]=right;
			return ;
		}
		
		int mid=(right+left)/2;
		if(target<numbers[mid]){
			binarySearch(numbers, left, mid-1, target, arr);
		}else if(target>numbers[mid]){
			binarySearch(numbers, mid+1, right, target, arr);
		}else{
			arr[0]=mid;
			arr[1]=mid;
			
			//计算左边边界
			int t1=mid;
			while(t1>left && numbers[t1]==numbers[t1-1]){
				t1--;
				arr[0]=t1;
			}
			
			//计算右边长度
			int t2=mid;
			while(t2<right && numbers[t2]==numbers[t2+1]){
				t2++;
				arr[1]=t2;
			}
		}
		
		return ;
	}
	
	public static int[] searchRange(int[] numbers,int target){
		if(numbers==null || numbers.length==0){
			return null;
		}
		
		int[] arr={-1,-1};
		
		binarySearch(numbers, 0, numbers.length-1, target, arr);
		
		return arr;
	}
}

