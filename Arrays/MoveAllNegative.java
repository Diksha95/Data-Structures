class MoveAllNegative{
	
	public static void moveAll(int arr[]){
		
		int low = 0;
		int high = arr.length-1;
		int mid = 0; 
		while(mid<=high){
			
			if(arr[mid] <0){
				
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}else if(arr[mid] > 0){
			
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				mid++;
				high--;
			}
		}
	}
	
	public static void main(String args[]){
		
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		moveAll(arr);
		
		for(int i:arr){
			
			System.out.print(i + " ");
		}
	}

}