class KadaneAlgorithm{

    public static void main(String args[]){
	
		int arr[] = {-5,-4,-6,-3,-4,-1};
		
		//System.out.println(maxSubarraySum(arr));
		System.out.println(getNegativeSubArray(arr));
	
	}
    //Function to find the sum of contiguous subarray with maximum sum.
	//This does not handle those cases when all elements are negative
    static int maxSubarraySum(int arr[]){
        
        int curr = 0;
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            
            curr+= arr[i]; 
            
            if(curr > max){
                max = curr;
            }
            if(curr<0){
                curr = 0;
				max = Math.max(max,curr);
            }
            
        }
        return max;
    }
	
	//Dp approach for handling all array elements
	public static int getNegativeSubArray(int arr[]){
		
		int curr = arr[0];
		int max = arr[0];
		
		for(int i = 1;i<arr.length;i++){
			
			curr = Math.max(arr[i],curr+arr[i]);
			max = Math.max(curr,max);
		}
		return max;
	}
    
}



