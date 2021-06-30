class TernarySearch{
	
	public static int ternarySearch(int arr[],int K){
		
		int low = 0 ; int high = arr.length-1;
		
		while(low<high){
		
			int mid1 = low + (high - low)/3; 
			int mid2 = high - (high -low)/3;
			
			if(arr[mid1] == K ) {
				return mid1;
			}
			if(arr[mid2] == K) {
				return mid2;
			} 
			//search in the first one third
			if(arr[mid1] > K) {
				high = mid1-1;
			}
			//search in the last one third
			else if(arr[mid2] < K) {
				low = mid2+1;
			}
			//search in the middle part
			else {
				low = mid1 + 1;
				high = mid2-1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(ternarySearch(arr,6));
	}

}