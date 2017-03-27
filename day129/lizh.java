// todo next “lizhonghao-2016-11-26”
import java.util.ArrayList;

public class SpiralMartrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] martrix={{1,2,3},
						{4,5,6},
						{7,8,9}};
		System.out.println(spiralMartrix(martrix));
	}
	
	public static ArrayList<Integer> spiralMartrix(int[][] martrix){
		ArrayList<Integer> result=new ArrayList<>();
		if(martrix==null || martrix.length==0 || martrix[0].length==0){
			return result;
		}
		
		int left=0;
		int right=martrix[0].length-1;
		int top=0;
		int bottom=martrix.length-1;
		
		while(result.size()<martrix.length*martrix[0].length){
			for(int i=left;i<=right;i++){
				result.add(martrix[top][i]);
			}
			top++;
			
			for(int j=top;j<=bottom;j++){
				result.add(martrix[j][right]);
			}
			right--;
			
			if(bottom<top) break;
			
			for(int i=right;i>=left;i--){
				result.add(martrix[bottom][i]);
			}
			bottom--;
			
			if(right<left) break;
			
			for(int j=bottom;j>=top;j--){
				result.add(martrix[j][left]);
			}
			left++;
		}
		
		return result;
	}
}


