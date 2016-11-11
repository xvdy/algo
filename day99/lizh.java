// todo next “lizhonghao-2016-11-11”
public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(3));
	}
	
	//思路：mid<sqrt(x)时，更新left,left=mid+1;mid>sqrt(x)时，更新right,right=mid-1;到最后都返回right;
	public static int sqrt(int x){
		int left=1,right=x;
		while(left<=right){
			int mid=left+(right-left)/2;
			
			if(mid==x/mid){
				return mid;
			}else if(mid<x/mid){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		
		return right;
	}
}


