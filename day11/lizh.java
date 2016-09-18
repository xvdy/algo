// todo next “lizhonghao-2016-09-17”
public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//这个例子刚好从开始出发，回到初始位置
		int[] gas={5,3,6,7,8,6};
		int[] cost={4,4,5,6,7,9};
		System.out.println(gas_station_1(gas, cost));

	}
	
	public static int gas_station_1(int[] gas,int[] cost){
		
		for(int i=0;i<gas.length;i++){
			int j=i;
			int current_gas=gas[j];
			while(current_gas>=cost[j]){
				// 走过第j个气站后剩下的
				current_gas-=cost[j];
				
				// 环形数组循环变量+1，其实没有必要这样写，数组存的时候就是按普通数组存的
				j=(j+1)%gas.length;
				
				//循环变量和初始的时候一样，则可以游玩一圈，返回初始值
				if(j==i){
					return i;
				}
				
				current_gas+=gas[j];
			}
		}
		
		return -1;
	}
	
	//这个想法是牛逼，但是想不出来，参考别人的
	public static int gas_station_2(int[] gas,int[] cost){
		if(gas==null || cost==null || gas.length!=cost.length){
			return -1;
		}
		
		int index=0;
		int sum=0;
		int total=0;
		for(int i=0;i<gas.length;){
			sum+=gas[i]-cost[i];
			total+=gas[i]-cost[i];
			if(sum<0){
				index=i+1;
				sum=0;
			}
			i=i+1;
		}
		
		return total>=0 ? index : -1;
	}

}

