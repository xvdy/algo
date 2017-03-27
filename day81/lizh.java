// todo next “lizhonghao-2016-11-2”
public class Search2DMartrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		if(search(numbers, 3)){
			System.out.println("寻找的元素存在于矩阵中！");
		}else{
			System.out.println("寻找的元素不存在于矩阵中！");
		}
	}
	
	public static boolean search(int[][] numbers,int target){
		if(numbers==null || numbers.length==0 ||numbers[0].length==0){
			return false;
		}
		
		int m=numbers.length;
		int n=numbers[0].length;
		
		int start=0;
		int end=m*n-1;
		
		while(start<=end){
			int mid=(start+end)/2;
			int midX=mid/n;
			int midY=mid%n;
			
			if(numbers[midX][midY]==target){
				return true;
			}
			
			if(numbers[midX][midY]<target){
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		return false;
	}
}

