// todo next “lizhonghao-2016-11-26”
import java.util.ArrayList;
public class PascalTrangleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pascalTrangleTwo(3));
	}
	
	public static ArrayList<Integer> pascalTrangleTwo(int rowNumber){
		ArrayList<Integer> result=new ArrayList<>();
		
		result.add(1);
		for(int i=1;i<rowNumber;i++){
			for(int j=result.size()-2;j>=0;j--){
				result.set(j+1,result.get(j)+result.get(j+1));
			}
			
			result.add(1);
		}
		
		return result;
	}
}


