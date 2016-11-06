// todo next “lizhonghao-2016-11-06”
public class NQueensNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nQueensNumbers(4));

	}
	
	public static int count=0;
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
	
	public static void helper(int[] row,int n,int index){
			if(index==n){
				count++;
				return ;
			}

			for(int i=0;i<n;i++){
				if(isValid(row, index, i)){
					row[index]=i;
					helper(row, n, index+1);
					row[index]=0;
				}
			}
		}
	
	public static int nQueensNumbers(int n){
		if(n<4){
			return 0;
		}
		
		int[] row=new int[n];
		helper(row, n, 0);
		
		return count;
	}
}

