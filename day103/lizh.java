// todo next “lizhonghao-2016-11-12”
public class ByAndSellTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices={2,1,2,0,1};
		System.out.println("max profit is:"+maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices){
		if(prices==null || prices.length==0){
			return -1;
		}
		
		int profit=0;
		int pre=Integer.MAX_VALUE;
		
		for(int i=0;i<prices.length;i++){
			if(pre<prices[i]){
				profit+=prices[i]-pre;
			}
			
			pre=prices[i];
		}
		
		return profit;
	}
}

