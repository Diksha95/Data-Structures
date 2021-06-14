class EquilibriumPoint{
	
	public static void main(String args[]){
		
		int arr [] = {1,3,5,2,2};
		System.out.println(getEquiPoint(arr));
	}
	
	public static int getEquiPoint(int arr[]){
		
		int n = arr.length;
		
		int total = 0;
		
		
		//Calculating sum
		for(int i = 0;i<n;i++){
			
			total+=arr[i];
		
		}
		int prefixSum = 0;
		//Calculation of leftSum and rightSum
		for(int i = 0;i<n;i++){
			
			if(2*prefixSum == total - arr[i]){
				return i;
			}
			prefixSum+=arr[i];
		}
		return -1;
	}
}