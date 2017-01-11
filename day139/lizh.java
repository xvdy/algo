// todo next “lizhonghao-2017-1-11”
package MicroSoftOneHundredExersizes;

public class TestArrayIsPostOrderOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean  testArrayIsBST(int[] numbers) {
		if(numbers.length==0)
			return false;
		if(numbers.length==1)
			return true;
		
		return test(numbers, 0, numbers.length-1);
	}
	
	public static boolean test(int[] numbers,int start,int root) {
		if(start>=root){
			return true;
		}
		
		int i=root;
		//从后面找到第一个比根节点小的结点
		while(i>start && numbers[i-1]>numbers[root]){
			i--;
		}
		
		for(int j=start;j<i;j++){
			if(numbers[j]>numbers[root])
				return false;
		}
		
		return test(numbers, start, i-1) && test(numbers, i, root);
	}
}


