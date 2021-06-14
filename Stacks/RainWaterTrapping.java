/* 	Leetcode : 42 https://leetcode.com/problems/trapping-rain-water/
	Time Complexity : O(n) */
class RainWaterTrapping{
	
	public static void main(String args[]){
		int arr [] = {3,0,0,2,0,4};
		
		//System.out.println(getTrappedWater(arr));
		//System.out.println(getTrappingBruteForce(arr));
		System.out.println(getConstantTrapping(arr));
	}
	
	//Complexity O(n) and Space O(n)
	public static int getTrappedWater(int arr[]){
		int n = arr.length;
		int maxL[] = new int[n];
		int maxR[] = new int [n];
		int water[] = new int [n];
		
		//Finding out the max value in left array for ith building
		maxL[0] = arr[0];
		for(int i = 1;i < n; i++){
			maxL[i] = Math.max(maxL[i-1],arr[i]);
		}
		
		//Finding out the max value in right array for ith building
		maxR[n-1] = arr[n-1];
		for(int i = n-2;i >=0; i--){
			maxR[i] = Math.max(maxR[i+1],arr[i]);
		}
		
		for(int i = 0;i < n; i++){
			water[i] = Math.min(maxR[i],maxL[i]) - arr[i];
		}
		
		//Getting the total unit of water above each building
		int sum =0;
		for(int i = 0;i < n; i++){
			sum += water[i];
		}
		return sum;
	}
	
	//O(n^2)
	public static int getTrappingBruteForce(int arr[]){
		
		int n = arr.length;
		int result = 0;
		for(int i = 0;i<n;i++){
			
			int left = arr[i];
			//finding maximum on left part of the array
			for(int j = 0;j<i;j++){
				left = Math.max(left,arr[j]);
			}
			int right = arr[i];
			for(int j = i+1;j<n;j++){
				right = Math.max(right,arr[j]);
			}
			
			result+=Math.min(left,right) - arr[i];
		}
		return result;
	}
	// Time O(n) Space O(1)
	public static int getConstantTrapping(int height[]){
		
		int i = 0;
		int j = height.length - 1;
		int leftMax = 0,rightMax = 0;
		int result = 0;
		while(i<j){
			
			//left side wall is lower than right side wall
			if(height[i] <= height[j]){
				
				//At any point i we will find out that wall which is of maximum height
				leftMax = Math.max(leftMax,height[i]);
				result += leftMax - height[i];
				i++;
			}
			//Scenario when leftHeight is greater than the right side height
			//water will be stored till lower height as flow from lower to higher
			else{
				rightMax = Math.max(rightMax,height[j]);
				result += rightMax - height[j];
				j--;
			}
		}
		return result;
	}
}