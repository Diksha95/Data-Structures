import java.util.*;
class LongestIncreasingSubsequence{
	
	public static int getIncreasing(int arr[]){
		
		int n = arr.length;
		int t[] = new int[n];
		Arrays.fill(t,1);
		
		for(int i = 1;i<n;i++){
			for(int j = 0;j<i;j++){
				if(arr[i] > arr[j] && t[i]<=t[j]){
					t[i] = 1+t[j];
				}
			}
		}
		int max = 0;
		for(int k = 0;k<t.length;k++){
			max = Math.max(max,t[k]);
		}
		return max;
	}
	
	public static void main(String args[]){
		
		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		
		System.out.println("LIS is :" + getIncreasing(arr));
	
	}
}