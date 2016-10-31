// todo next “lizhonghao-2016-10-31”
public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={1,0,1,2};
		display(numbers);
		
		sortColors(numbers);
		display(numbers);
	}
	
	public static void sortColors(int[] numbers){
		if(numbers==null || numbers.length==0){
			return ;
		}
		
		int[] countArray=new int[3];
		for(int i=0;i<numbers.length;i++){
			countArray[numbers[i]]+=1;
		}
		
		for(int i=1;i<=2;i++){
			countArray[i]=countArray[i]+countArray[i-1];
		}
		
		for(int i=0;i<=2;i++){
			int num=0;
			if(i==0){
				num=countArray[i];
			}else{
				num=countArray[i]-countArray[i-1];
			}
			
			int index=countArray[i]-1;
			while(num>0){
				numbers[index]=i;
				index--;
				num--;
			}
		}
	}
	
	public static void display(int[] numbers){
		for(int num:numbers){
			System.out.print(num+" ");
		}
		
		System.out.println();
	}
}

