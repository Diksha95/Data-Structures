import java.util.*;
class LargestSubArray{
	
	public static void main(String args[]){
	
	int arr [] = {-5, 8, -14, 2, 4, 12};
	
	//System.out.println(getLargestSubarray(arr,5));
	System.out.println(lenOfLongSubarr(arr,-5));
	}	
	// this approach will work only for positive numbers
	public static int getLargestSubarray(int arr[],int reqdSum){
	
		int i = 0,j = 0;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		while(j<arr.length){
			
			sum+=arr[j];
			
			if(sum < reqdSum){
				j++;
			}
			else if(sum == reqdSum){
				
				//caculating the maximum window size
				max = Math.max(max,j-i+1);
				j++;
			}
			else if(sum > reqdSum){
				
				while(sum > reqdSum){
					
					sum-=arr[i];
					i++;
				}
				j++;
			}
		}
		return max;
	}
	
	public static int lenOfLongSubarr (int arr[],int K) {
       
       Map<Integer,Integer> map = new HashMap<>();
		int sum = 0,max = 0;
		int i = 0;
		while(i < arr.length){
			
			sum+=arr[i];
			
			// if sum is reached reqd sum
			if(sum == K){
				max = i+1;
			}
			//putting the sum along with its index
			if(!map.containsKey(sum)){
				map.put(sum,i);
			}
			if(map.containsKey(sum-K)){
				
				max = Math.max(max,i - map.get(sum-K));
			}
			i++;
		}
		return max;
    }
}