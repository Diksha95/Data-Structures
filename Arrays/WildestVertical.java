/* https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/ */

import java.util.*;
class WildestVertical{
	
	public static void main(String args[]){
	
		int arr[][] = {{8,7},{9,9},{7,4},{9,7}};
		System.out.println(getWildestVertical(arr));
	}

	public static int getWildestVertical(int arr[][]){
		
		int n = arr.length;
		int x[] = new int[n];
		
		for(int i = 0;i<n;i++){
			
			x[i] = arr[i][0];
		}
		Arrays.sort(x);
		int max = 0;
		for(int i = 0;i< n-1;i++){
			
			max = Math.max(max,x[i+1]-x[i]);
		}
		return max;
	}
}