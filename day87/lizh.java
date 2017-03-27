// todo next “lizhonghao-2016-11-04”
import java.util.LinkedList;

public class SurroundedRegions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board={{'X','X','X','X'},
						{'X','o','o','X'},
						{'X','X','o','X'},
						{'X','o','X','X'}};
		display(board);
		
		surroundRegions(board);
		System.out.println("变换后：");
		display(board);
	}
	
	//寻找边界上的'o'元素，找到后采用BFS搜索其周围的元素，若为'o',将其设置为'1',最后全部扫描
	//'o'的位置变为'X'，'1'的位置变为'o'
	public static void bfs(char[][] board,int row,int col){
		int m=board.length;
		int n=board[0].length;
		
		int index=row*n+col;
		LinkedList<Integer> queue=new LinkedList<>();
		queue.offer(index);
		board[row][col]='1';
		
		while(!queue.isEmpty()){
			int top=queue.poll();
			int i=top/n;
			int j=top%n;
			
			if(i-1>=0 && board[i-1][j]=='o'){
				board[i-1][j]='1';
				queue.offer((i-1)*n+j);
			}
			
			if(i+1<m && board[i+1][j]=='o'){
				board[i+1][j]='1';
				queue.offer((i+1)*n+j);
			}
			
			if(j-1>=0 && board[i][j-1]=='o'){
				board[i][j-1]='1';
				queue.offer(i*n+j-1);
			}
			
			if(j+1<n && board[i][j+1]=='o'){
				board[i][j+1]='1';
				queue.offer(i*n+j+1);
			}
		}
	}
	
	public static void surroundRegions(char[][] board){
		if(board==null || board.length==0 || board[0].length==0){
			return;
		}
		
		int m=board.length;
		int n=board[0].length;
		
		for(int j=0;j<n;j++){
			if(board[0][j]=='o'){
				bfs(board, 0, j);
			}
		}
		
		for(int j=0;j<n;j++){
			if(board[m-1][j]=='o'){
				bfs(board, m-1, j);
			}
		}
		
		for(int i=0;i<n;i++){
			if(board[i][0]=='o'){
				bfs(board, i, 0);
			}
		}
		
		for(int i=0;i<n;i++){
			if(board[i][n-1]=='o'){
				bfs(board, i, n-1);
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(board[i][j]=='o'){
					board[i][j]='X';
				}
				
				if(board[i][j]=='1'){
					board[i][j]='o';
				}
			}
		}
	}
	
	public static void display(char[][] board){
		if(board==null || board.length==0 || board[0].length==0){
			return;
		}
		
		int m=board.length;
		int n=board[0].length;
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(board[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}


