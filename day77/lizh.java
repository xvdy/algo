// todo next “lizhonghao-2016-10-29”
public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,5,6,7};
		System.out.println("first missing positive numbers is："+firstMissingPositive(a));
	}
	
	//a[i]!=i+1时，交换a[i]和a[a[i]-1],直到a[i]==a[a[i]-1]
	public static int firstMissingPositive(int[] a){
		if(a==null || a.length==0){
			return 0;
		}
		
		for(int i=0;i<a.length;i++){
			while(a[i]>0 && a[i]<=a.length && a[i]!=i+1){
				int temp=a[a[i]-1];
				if(a[i]==temp){
					break;
				}
				
				a[a[i]-1]=a[i];
				a[i]=temp;
			}
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]!=i+1){
				return i+1;
			}
		}
		
		return a.length+1;
	}
}

