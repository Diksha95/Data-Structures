/* Leetcode : 45  https://leetcode.com/problems/jump-game-ii/ */
import java.util.*;
class JumpGameSecond{
	
	public static void main(String args[]){
		
		int arr[] = {2,3,1,1,4};
		
		System.out.println(getMinJumps(arr));
		System.out.println(getMinJumpsOptimal(arr));
	}
	
	//Complexity O(n^2) Space complexity O(n)
	public static int getMinJumps(int nums[]){
		
		int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n-1] = 0;
        
        for(int i = n-2;i>=0;i--){
            
            int min = Integer.MAX_VALUE;
            for(int j = i+1;j<=Math.min(n-1,i+nums[i]);j++){
                min = Math.min(min,dp[j]);
            }
            
            if(min!=Integer.MAX_VALUE){
                dp[i] = min + 1;
            }
        }
        return dp[0];
	}
	//Complexity : O(n)
	public static int getMinJumpsOptimal(int nums[]){
		
		int n = nums.length;
		
		if(n<=1){
			return 0;
		}
		//keep track of largest ladder got so far
		int ladder = nums[0];
		int stairs = nums[0];
		int jump = 1;
		for(int i = 1;i<n;i++){
			
			//reached end of the array
			if(i == n-1){
				return jump;
			}
			if(i+nums[i]>ladder){
				ladder = i+nums[i];
			}
			stairs--;
			//stairs over we need to jump to new ladder
			if(stairs == 0){
				jump++;
				stairs = ladder - i;
			}
		}
		return jump;	
	}
}