class MinJump{
	
	public static void main(String args[]){
		
		int arr[] = {2,3,1,1,4};
		
		System.out.println(canJump(arr));
	
	}
	
	public static boolean canJump(int nums[]){
		
		int lastGoodIndex = nums.length - 1;
        
        for(int i = nums.length -1;i>=0;i--){
            
            if(i+nums[i]>=lastGoodIndex){
                lastGoodIndex = i;
            }
        }
        //whether we were able to reached start of the array
        return lastGoodIndex == 0;
	}

}