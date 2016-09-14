// todo next “lizhonghao-2016-09-3”
// 思路：如果一个数字最后一位不是9，加一即可；如果一个数字的最后一位是9，需要将最后一位置0，它的前一位加1
// 特殊情况是形如99或999这种数字，加1后该位置0，前一位也置0，最后所有位都变为0，写一个函数循环调用即可，
// 最后建立一个新的数组，长度加1，首位置1，其余位置0
public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4};
		plus_one(a);
		int[] b={9,9,9,9,9};
		plus_one(b);
		

	}
	
	public static void plus_one(int[] numbers){
		if(numbers==null){
			return;
		}
		int index=numbers.length-1;
		while(index>=0){
			if(numbers[index]!=9){
				numbers[index]+=1;
				break;
			}else{
				numbers[index]=0;
				index--;
			}
		}
		
		if(numbers[0]==0){
			int[] new_numbers=new int[numbers.length+1];
			new_numbers[0]=1;
			for(int num:new_numbers){
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		if(numbers[0]!=0)
		{
			for(int num:numbers){
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}
}

