// todo next “lizhonghao-2016-11-30”
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class FindKMaximumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={1,2,3,4,5,6,7,8};
		System.out.println(getMinNumbersByPartition(numbers, 4));

	}
	
	// 方法1：利用TreeSet来存储
	public static ArrayList<Integer> getKMaximumNumbers(int[] numbers,int k){
		ArrayList<Integer> result=new ArrayList<>();
		int count=0;
		if(numbers==null || numbers.length==0 || k==0 || k>numbers.length){
			return result;
		}
		
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=0;i<numbers.length;i++){
			set.add(numbers[i]);
		}
		
		Iterator<Integer> it=set.iterator();
		
		while(it.hasNext() && count<k){
			result.add(it.next());
			count++;
		}
		
		return result;
	}
	
	//方法2：用PriorityQueue<>实现一个最大堆,实现comparator()接口降序排列
	public static ArrayList<Integer> getKMinNumbersByMaxHeap(int[] numbers,int k){
		ArrayList<Integer> result=new ArrayList<>();
		if(numbers==null || numbers.length==0 || k==0 || k>numbers.length){
			return result;
		}
		
		PriorityQueue<Integer> heap=new PriorityQueue<>(k,new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2){
				return o2.compareTo(o1);
			}
		});
		
		for(int i=0;i<numbers.length;i++){
			if(heap.size()<k){
				heap.offer(numbers[i]);
			}else if(heap.peek()>numbers[i]){
				heap.remove(heap.peek());
				heap.offer(numbers[i]);
			}
		}
		
		for(Integer number:heap){
			result.add(number);
		}
		
		return result;
	}
	
	//方法3：利用partition的思想
	public static int partition(int[] numbers,int start,int end){
		int tmp=numbers[start];
		while(start<end){
			while(start<end && numbers[end]>=tmp){
				end--;
			}
			numbers[start]=numbers[end];
			
			while(start<end && numbers[start]<=tmp){
				start++;
			}
			numbers[end]=numbers[start];
		}
		
		numbers[start]=tmp;
		return start;
	}
	
	public static ArrayList<Integer> getMinNumbersByPartition(int[] numbers,int k){
		ArrayList<Integer> result=new ArrayList<>();
		if(numbers==null || numbers.length==0 || k==0 || k>numbers.length){
			return result;
		}
		
		int start=0;
		int end=numbers.length-1;
		int index=partition(numbers, start, end);
		while(index!=k-1){
			if(index<k-1){
				start=index+1;
			}else{
				end=index-1;
			}
			
			index=partition(numbers, start, end);
		}
		
		for(int i=0;i<k;i++){
			result.add(numbers[i]);
		}
		
		return result;
	}
}


