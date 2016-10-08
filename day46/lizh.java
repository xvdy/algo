// todo next “lizhonghao-2016-10-07”
import java.util.Stack;
public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={2,1,5,6,2,3};
		System.out.println("直方图中矩形最大的面积是："+largestRectangleInHistogram(numbers));

	}
	
	public static int largestRectangleInHistogram(int[] numbers){
		int area=0;
		Stack<Integer> stack=new Stack<>();
		
		for(int i=0;i<numbers.length;i++){
			if(stack.empty() || numbers[stack.peek()]<numbers[i]){
				stack.push(i);
			}else{
				int start=stack.pop();
				int width=stack.empty()?i:i-stack.peek()-1;
				area=Math.max(area, numbers[start]*width);
				i--;
			}
		}
		
		while(!stack.empty()){
			int start=stack.pop();
			int width=stack.empty()?numbers.length:numbers.length-stack.peek()-1;
			area=Math.max(area, numbers[start]*width);
		}
		
		return area;
	}
}

