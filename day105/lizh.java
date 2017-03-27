// todo next “lizhonghao-2016-11-12”
public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height={1,3,2};
		System.out.println("most water is:"+maxArea(height));
	}
	
	public static int maxArea(int[] height){
		int area=0,maxArea=0;
		int left=0,right=height.length-1;
		if(height==null || height.length<2){
			return area;
		}
		
		while(left<right){
			area=(right-left)*Math.min(height[left], height[right]);
			maxArea=Math.max(maxArea, area);
			
			if(height[left]<height[right]){
				left++;
			}else{
				right--;
			}
		}
		
		return maxArea;
	}
}

