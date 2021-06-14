class RearrangeArray{
	
	public static void main(String args[]){
		
		int arr[] = {1,2,3,4,5,6,7};
		
		int arr1[] = rearrangeArray(arr);
		
		for(int i = 0;i<arr1.length;i++){
			
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\n**********************");
		rearrangeArraySecond(arr);
	}
	
	//Time complexity O(n) Space Complexity O(n)
	public static int[] rearrangeArray(int arr[]){
		
		int arr1 [] = new int[arr.length];
		
		int i = 0,j = arr.length - 1;
		int k = 0;
		
		while(k < arr.length - 1){
			
			arr1[k] = arr[j];
			k++;
			j--;
			
			arr1[k] = arr[i];
			k++;
			i++;
		}
		if(i==j){
			arr1[k] = arr[i];
		}
		return arr1;
	}
	
	//Time Complexity O(n) Space Complexity O(1)
	public static void rearrangeArraySecond(int arr[]){
		
		int max_index = arr.length - 1;
		int min_index = 0;
		int max = arr[arr.length-1] + 1;
		
		for(int i = 0 ; i<arr.length;i++){
			
			if(i%2==0){
				arr[i] = (arr[max_index]%max)* max + arr[i];
				max_index --;
			}else{
				arr[i] = (arr[min_index]%max)* max + arr[i];
				min_index++;
			}
		}
		
		for(int i = 0 ; i<arr.length;i++){
			
			arr[i]/=max;
		}
		
		for(int i = 0;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
		}
		
	}

}