// todo next “lizhonghao-2016-11-27”
import java.util.HashMap;
public class MaxPointOnALine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] points={new Point(0, 0),new Point(1, 2),new Point(1, 3),new Point(3, 6)};
		System.out.println("max points on one line is： "+maxPoint(points));
	}
	
	public static int maxPoint(Point[] points){
		if(points==null || points.length==0){
			return 0;
		}
		
		HashMap<Double, Integer> map=new HashMap<>();
		int max=0;
		int duplicate=0;
		int vertical=0;
		
		for(int i=0;i<points.length;i++){	
			for(int j=i+1;j<points.length;j++){
				if(points[i].x==points[j].x){
					if(points[i].y==points[j].y){
						duplicate++;
					}else{
						vertical++;
					}
				}else{
					double slope=points[i].y==points[j].y?0:(1.0*(points[i].y-points[j].y)/(points[i].x-points[j].x));
					if(!map.containsKey(slope)){
						map.put(slope, 1);
					}else{
						map.put(slope,map.get(slope)+1);
					}
				}
			}
		}
		
		for(int number:map.values()){
			if(number>max){
				max=number;
			}
		}
		
		max=Math.max(max+duplicate, duplicate+vertical);
		return max;	
	}
	
	public static class Point{
		int x;
		int y;
		public Point(int x,int y) {
			// TODO Auto-generated constructor stub
			this.x=x;
			this.y=y;
		}
	}
}


