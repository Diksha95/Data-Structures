/*Leetcode : 560  
https://leetcode.com/problems/subarray-sum-equals-k/ */
import java.util.*;
class SubarraySumEqualsK{
	
	public static void main(String args[]){
	
	int arr [] = {1,2,3};
	
	System.out.println(subarraySum(arr,3));
	}	
	
	public static int subarraySum (int nums[],int K) {
       
      Map<Integer,Integer> map = new HashMap<>();
		int sum = 0,count = 0;
		// edge case where i == 0 index is out of range therefore for first element                 putting
		// 0 as sum
		// arr = [1 2 3]
		// sum = [0 1 1+2 1+2+3]  sum[i] = sum [i-1] + arr[i-1]
		map.put(0,1);
		
		for(int i  = 0 ; i< nums.length;i++){
			
			sum+= nums[i];
			
			if(map.containsKey(sum - K)) count+= map.get(sum - K);
			
			map.put(sum,map.getOrDefault(sum,0)+1);	
		}
		return count;
    }
}