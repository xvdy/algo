// todo next “lizhonghao-2016-09-13”
// 思路：它是逐层循环赋值的，这个是参考九章算法写的
public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers={{1,2,3},{4,5,6},{7,8,9}};
		display(numbers);
		rotate_image(numbers);
		System.out.println("顺时针旋转90°后");
		display(numbers);
		

	}
	
	public static void rotate_image(int[][] numbers){
		int length=numbers.length;
		if(numbers==null ||numbers[0].length==0 || numbers.length==0){
			return;
		}
		
		for(int i=0;i<length/2;i++)
			for(int j=0;j<(length+1)/2;j++){
				int temp=numbers[i][j];
				numbers[i][j]=numbers[length-j-1][i];
				numbers[length-j-1][i]=numbers[length-i-1][length-j-1];
				numbers[length-i-1][length-j-1]=numbers[j][length-i-1];
				numbers[j][length-i-1]=temp;
			}
	}
	
	public static void display(int[][] numbers){
		for(int i=0;i<numbers.length;i++){
			for(int j=0;j<numbers[0].length;j++){
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

}

