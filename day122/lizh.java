// todo next “lizhonghao-2016-11-20”
import java.util.ArrayList;
public class InsertInterval {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Interval{
		int start;
		int end;
		public Interval(int start,int end){
			// TODO Auto-generated constructor stub
			this.start=start;
			this.end=end;
		}
		
		public Interval() {
			// TODO Auto-generated constructor stub
			this.start=0;
			this.end=0;
		}
	}
	
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals,Interval newinterval){
		ArrayList<Interval> result=new ArrayList<>();
		
		for(Interval interval:intervals){
			if(interval.end<newinterval.start){
				result.add(interval);
			}else if(newinterval.end<interval.start){
				result.add(newinterval);
				newinterval=interval;//更新当前的间隔
			}else{
				newinterval=new Interval(Math.min(interval.start, newinterval.start), Math.max(newinterval.end, interval.end));
			}
		}
		
		result.add(newinterval);
		return result;
	}
}

