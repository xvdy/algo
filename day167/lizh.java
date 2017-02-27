// todo next “lizhonghao-2017-02-27”
package MicroSoftOneHundredExersizes;

public class RectCover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solutionByRecursive(4));
		System.out.println(solutionByIterative(4));
	}
	
	public static int solutionByRecursive(int target){
		if(target <= 0){
			return 0;
		}else if(target <= 3){
			return target;
		}else{
			return solutionByRecursive(target-1)+solutionByRecursive(target-2);
		}
	}
	public static int solutionByIterative(int target){
		if(target <= 0){
			return 0;
		}else if(target <= 3){
			return target;
		}
		int prePre = 2;
		int pre = 3;
		int result=0;
		for(int i = 4;i <= target;++i){
			result = prePre + pre;
			prePre = pre;
			pre = result;
		}
		return result;
	}
}


