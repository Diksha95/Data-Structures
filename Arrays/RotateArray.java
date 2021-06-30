/* Leetcode : 189
https://leetcode.com/problems/rotate-array/ 
Time complexity : O(n)
Space Complexity : O(1)
*/
class RotateArray{

	public static void main(String args[]){
		
		int arr[] = {1, 2, 3, 4, 5};
		
		int k = 3;
		
		rotateArray(arr,3);
		
		for(int i : arr){
			
			System.out.print(i + " ");
		}
	
	}
	
	public static void rotateArray(int nums[],int k){
		
		k = k % nums.length;
		
		//part 1 reverse
        reverse(nums,0,nums.length - k - 1);
        //part 2 reverse
        reverse(nums,nums.length-k,nums.length-1);
        //whole reverse
        reverse(nums,0,nums.length-1);
	}

	public static void reverse(int []nums, int i,int j){
        
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
            i++;
            j--;
        }
    }
}