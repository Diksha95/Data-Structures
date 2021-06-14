class SellStock{

	public static void main(String args[]){
	
	int arr[] = {7,1,5,3,6,4};
	
	System.out.println(maxProfit(arr));
	}
	
	public static int maxProfit(int arr[]){
		
		int maxProfit = 0 ; int min = Integer.MAX_VALUE;
		
		for(int i = 0; i< arr.length;i++){
			
			//finding the min price first
			if(arr[i] < min) min = arr[i];
			if(arr[i] > min) maxProfit = Math.max(arr[i] - min, maxProfit);
		}
		return maxProfit;
	}
}