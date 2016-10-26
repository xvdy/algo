// todo next “lizhonghao-2016-10-26”
public class MergedSortedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,4,7,0,0};
		int[] b={2,6};
		
		mergeSortedArray(a, noZerosNumber(a), b, b.length);
		
		for(int num:a){
			System.out.print(num+" ");
		}
	}
	
	public static void mergeSortedArray(int[] a,int m,int[] b,int n){
		while(m>0 && n>0){
			if(a[m-1]>b[n-1]){
				a[m+n-1]=a[m-1];
				m--;
			}else{
				a[m+n-1]=b[n-1];
				n--;
			}
		}
		
		while(n>0){
			a[m+n-1]=b[n-1];
			n--;
		}
	}
	
	public static int noZerosNumber(int[] a){
		int count=0;
		
		for(int num:a){
			if(num!=0){
				count++;
			}
		}
		
		return count;
	}
}

