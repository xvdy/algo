// todo next “lizhonghao-2016-09-18”
/**
 * @author "lizhonghao"
 *方法一太牛逼，没想明白，不解释
 *方法二：在Java中int型在计算机中是按32位存储的，建立一个32位的数组来记录给定的数组中所有元素每一位出现的
 *次数，在本题中数组中只有一个元素只出现一次，剩余的出现3次，32位的数组记录的也许是0出现的次数，也可以是1出
 *现的次数，求余后肯定是只出现一次那个数在相应位上的二进制数值。将数组中的每一个元素第i位移到最低位与1求余，
 *统计其次数，找到出现一次的数第i位的二进制位，将其重新移到第i位保存下来，循环32次后就可以将出现一次的那个数
 *的32位二进制全部保存下来了。
 *
 */
public class SingleNumberTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={1,1,2,3,3,3,2,2,4,1};
		System.out.println("出现一次的数是："+singleNumber_2(numbers));

	}
	
	
	//这个算法太牛逼了，想了很久没有想明白
	public static int singleNumber_1(int[] numbers){
		int ones=0;
		int twos=0;
		for(int i=0;i<numbers.length;i++){
			ones=(ones^numbers[i]) & ~twos;
			twos=(twos^numbers[i]) & ~ones;
		}
		
		return ones;
	}
	
	public static int singleNumber_2(int[] numbers){
		int[] count=new int[32];
		int result=0;
		
		for(int i=0;i<32;i++){
			for(int j=0;j<numbers.length;j++){
				count[i]+=(numbers[j]>>i) & 1;
			}
			
			result |=(count[i]%3)<<i;
		}
		
		return result;
	}
}

