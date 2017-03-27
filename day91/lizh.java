// todo next “lizhonghao-2016-11-06”
import java.util.ArrayList;
public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solveQueens(4));
	}
	
	//采用一维数组来表示结果，数组的下标i代表棋盘的第i行，下标i对应的值为第i行皇后所在的列
	public static boolean isValid(int[] row,int rowNumber,int colNumber){
		for(int i=0;i<rowNumber;i++){
			if(row[i]==colNumber){
				return false;
			}
			
			if(Math.abs(row[i]-colNumber)==Math.abs(i-rowNumber)){
				return false;
			}	
		}
		
		return true;
	}
	
	public static ArrayList<String> translateString(int[] row){
		ArrayList<String> result=new ArrayList<>();
		
		for(int i=0;i<row.length;i++){
			StringBuilder sb=new StringBuilder();
			for(int j=0;j<row.length;j++){
				if(row[i]==j){
					sb.append("Q");
				}else{
					sb.append("#");
				}
			}
			
			result.add(sb.toString());
		}
		
		return result;
	}
	
	//index:一维数组的下标，棋盘的行数
	public static void helper(ArrayList<ArrayList<String>> result,int[] row,
								int n,int index){
		if(index==n){
			ArrayList<String> temp=translateString(row);
			result.add(temp);
			return ;
		}
		
		for(int i=0;i<n;i++){
			if(isValid(row, index, i)){
				row[index]=i;
				helper(result, row, n, index+1);
				row[index]=0;
			}
		}
	}
	
	public static ArrayList<ArrayList <String>> solveQueens(int n){
		ArrayList<ArrayList <String>> result=new ArrayList<ArrayList <String>>();
		
		if(n<4){
			return result;
		}
		
		int[] row=new int[n];
		helper(result, row, n, 0);
		
		return result;
	}
}


