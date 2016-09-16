// todo next “lizhonghao-2016-09-16”
public class SetMartrixZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers={{1,1,1,0},
						 {1,1,1,0},
						 {1,1,0,0},
						 {1,0,0,0}};
		setMratrixZero(numbers);
		for(int i=0;i<numbers.length;i++){
			for(int j=0;j<numbers[0].length;j++){
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public static void setMratrixZero(int[][] numbers){
		boolean firstRow=false;
		boolean firstColumn=false;
		
		//寻找第一列中是否存在0元素，若存在将firstColumn置true
		for(int i=0;i<numbers.length;i++){
			if(numbers[i][0]==0){
				firstColumn=true;
				break;
			}
		}
		
		
		//寻找第一行中是否存在0元素，若存在将firstRow置true
		for(int i=0;i<numbers[0].length;i++){
			if(numbers[0][i]==0){
				firstRow=true;
				break;
			}
		}
		
		//从第二行和第二列开始遍历每一个元素，若为0，将这个元素投影到第一行和第一列对应的元素置0
		for(int i=1;i<numbers.length;i++){
			for(int j=1;j<numbers[0].length;j++){
				if(numbers[i][j]==0){
					numbers[i][0]=0;
					numbers[0][j]=0;
				}
			}
		}
		
		//从第二行和第二列开始遍历每一个元素,检查这个元素投影到第一行和第一列的元素是否为0，若其中有一个
		//为0，将遍历到的这个元素置0
		for(int i=1;i<numbers.length;i++){
			for(int j=1;j<numbers[0].length;j++){
				if(numbers[i][0]==0 || numbers[0][j]==0){
					numbers[i][j]=0;
				}
			}
		}
		
		//检查第一列的标示元素，若为true,将第一列置0
		if(firstColumn){
			for(int i=0;i<numbers.length;i++){
				numbers[i][0]=0;
			}
		}
		
		//检查第一行的标示元素，若为true,将第一行置0
		if(firstRow){
			for(int i=0;i<numbers[0].length;i++){
				numbers[0][i]=0;
			}
		}	
	}
}

