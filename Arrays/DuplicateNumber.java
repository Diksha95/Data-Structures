/*Leetcode : 287 https://leetcode.com/problems/find-the-duplicate-number/ */
import java.util.*;
class DuplicateNumber{
	
	public static void main(String args[]){
		
		int arr[] = {1,3,4,2,2};
		System.out.println(getDuplicate(arr));
		System.out.println(getDuplicateBetter(arr));
		System.out.println(getDuplicateOptimal(arr));
	}
	
	//Brute Force Solution Time : O(nlogn) Space O(1)
	public static int getDuplicate(int nums[]){
		
		Arrays.sort(nums);
		int duplicate = 0;
		for(int i = 0;i<nums.length-1;i++){
			
			if(nums[i] == nums[i+1]){
				
				duplicate = nums[i];
			}
		}
		return duplicate;
	}
	
	//Better approach Time : O(n) Space O(n)
	public static int getDuplicateBetter(int nums[]){
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++){
			
			if(!map.containsKey(nums[i])){
				map.put(nums[i],1);
			}else{
				map.put(nums[i],map.get(nums[i])+1);
			}
		}
		
		for(Map.Entry<Integer,Integer> e : map.entrySet()){
			
			if(e.getValue() > 1){
				return e.getKey();
			}
		}
		return -1;
	}
	//Optimal Approach Time:O(n) Space:O(1)
	public static int getDuplicateOptimal(int nums[]){
		
		if(nums.length==0){
			return 0;
		}
		int slow = nums[0];
		int fast = nums[0];
		
		//finding the first collision point for both the pointers
		do{
			slow = nums[slow];
			fast = nums[nums[fast]];
		}while(fast!=slow);
		
		//resetting it to start of the array
		fast = nums[0];
		
		while(fast!=slow){
			slow = nums[slow];
			fast = nums[fast];
		}
		return fast;
	}
}