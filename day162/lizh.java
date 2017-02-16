// todo next “lizhonghao-2017-02-16”
package MicroSoftOneHundredExersizes;

public class SearchInMartrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean findTargetByBinarySearch(int [][] mar,int target){
		for(int i = 0;i < mar.length;++i){
			int low = 0;
			int high = mar[i].length;
			while(low <= high){
				int mid =(low+high) / 2;
				if(target < mar[i][mid]){
					high = mid - 1;
				}else if(target > mar[i][mid]){
					low = mid + 1;
				}else{
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean findTargetByLeftBottomSearch(int [][] mar,int target){
		int row = mar.length-1;
		int col = 0;
		while(row != 0 && col < mar[0].length){
			if(mar[row][col] < target){
				col++;
			}else if(mar[row][col] > target){
				row--;
			}else{
				return true;
			}
		}
		return false;
	}
}


