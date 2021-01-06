/*Problem Statement - https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
Time Complexity 0(n2)
Space Complexity O(1) no extra space used
*/

import java.util.*;

class TripletsSum {
	public static void main (String[] args) {
		int arr[]={12,3,4,1,6,9};
	    System.out.println(findTriplets(arr,arr.length));
	
	}
	
	public static boolean findTriplets(int arr[],int n){
	    
	    Arrays.sort(arr);
	    for(int i=0;i<n-2;i++){ 
	        //n-2 because 1 for i and 2nd is j so 2 elements are removed
	        if(twoSum(arr,-arr[i],i+1))  //index of first elements in the remaining arrays
	        return true;
	    }
	    return false;
	}
	
	public static boolean twoSum(int a[],int x,int i){
	    int j=a.length-1;
	    while(i<j){
	        if(a[i]+a[j]>x){
	            j--;
	        }
	        else if(a[i]+a[j]<x){
	            i++;
	        }
	        return true;
	    }
	    
	    return false;
	}
}