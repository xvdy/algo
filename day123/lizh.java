// todo next “lizhonghao-2016-11-22”
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class MergeIntervals {

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
	
	public static  class IntervalComparator implements Comparator<Interval>{
		public int compare(Interval first,Interval second){
			return first.start-second.start;
		}
	}
	
	public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals){
		ArrayList<Interval> result=new ArrayList<>();
		
		if(intervals==null || intervals.size()<=1){
			return intervals;
		}
		
		Collections.sort(intervals, new IntervalComparator());
		Interval temp=intervals.get(0);
		for(int i=1;i<intervals.size();i++){
			Interval cur=intervals.get(i);
			if(temp.end>=cur.start){
				temp.end=Math.max(temp.end, cur.end);
			}else{
				result.add(temp);
				temp=cur;
			}
		}
		
		result.add(temp);
		return result;	
	}
}

