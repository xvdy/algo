// todo next “lizhonghao-2016-09-13”

public class Trapping_Rain_Water_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("volume:"+waterVolume(numbers));
	}
	
	public static int waterVolume(int[] numbers){
		int result=0;
		
		if(numbers==null || numbers.length<=2){
			return result;
		}
		
		int[] left=new int[numbers.length];
		int[] right=new int[numbers.length];
		
		//从左边扫描
		int max=numbers[0];
		left[0]=numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]<max){
				left[i]=max;
			}else{
				left[i]=numbers[i];
				max=numbers[i];
			}
		}
		
		//从右边扫描
		right[numbers.length-1]=numbers[numbers.length-1];
		max=numbers[numbers.length-1];
		for(int i=numbers.length-2;i>0;i--){
			if(numbers[i]<max){
				right[i]=max;
			}else{
				right[i]=numbers[i];
				max=numbers[i];
			}
		}
		
		//计算面积
		for(int i=0;i<numbers.length;i++){
			result+=Math.min(left[i], right[i])-numbers[i];
		}
		
		return result;
	}

}

