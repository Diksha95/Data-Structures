class FindMissing{

	public static void main(String args[]){
	
		int arr[] = {1,2,3,4,6,7,8};
		
		System.out.println(getMissingNo(arr,arr.length));
	}

	public static int getMissingNo(int arr[],int n){
		
		int sum = 0;
		
		for(int i = 0;i<n-1;i++){
		
			sum+= arr[i];
			
		}
		//delete from the first sum of natural numbers
		return (n*(n+1)/2) - sum;
	}
}