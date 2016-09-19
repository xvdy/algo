// todo next “lizhonghao-2016-09-18”
import java.util.LinkedList;
/**
 * @author "lizhonghao"
 * 这个算法链表没有用它自己定义的，直接用库里面的LinkedList实现的
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated  method stub
		LinkedList<Integer> numbers_1=new LinkedList<>();
		LinkedList<Integer> numbers_2=new LinkedList<>();
		numbers_1.add(2);
		numbers_1.add(4);
		numbers_1.add(3);
		
		numbers_2.add(5);
		numbers_2.add(6);
		numbers_2.add(4);
		
		System.out.println(addTwoNumbers(numbers_1, numbers_2));
	}
	
	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> numbers_1,LinkedList<Integer>numbers_2){
		if(numbers_1.size()!=numbers_2.size() || numbers_1==null || numbers_2==null){
			return null;
		}
		
		LinkedList<Integer> result=new LinkedList<>();
		int index=numbers_1.size()-1;
		int flag=0;
		int sum=0;
		
		while(index>=0){
			sum=numbers_1.get(index)+numbers_2.get(index)+flag;
			
			if(sum<10){
				result.add(sum);
				flag=0;
			}else{
				result.add(sum%10);
				flag=1;
			}
			
			index--;
		}
		
		if(flag==1){
			result.add(sum/10);
		}
		
		return result;
	}
}

