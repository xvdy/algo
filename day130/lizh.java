// todo next “lizhonghao-2016-11-26”
public class SpiralMartrixTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] martrix=spiralMartrix(3);
		for(int i=0;i<martrix.length;i++){
			for(int j=0;j<martrix.length;j++){
				System.out.print(martrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] spiralMartrix(int n){
		int[][] martrix=new int[n][n];
		int begin=0;
		int end=n-1;
		int number=1;
		
		while(begin<end){
			for(int i=begin;i<end;i++){
				martrix[begin][i]=number++;
			}
			
			for(int j=begin;j<end;j++){
				martrix[j][end]=number++;
			}
			
			for(int i=end;i>begin;i--){
				martrix[end][i]=number++;
			}
			
			for(int j=end;j>begin;j--){
				martrix[j][begin]=number++;
			}
			
			begin++;
			end--;
		}
		
		if(begin==end) martrix[begin][end]=number;
		
		return martrix;
	}
}


