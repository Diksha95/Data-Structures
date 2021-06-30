/* Leetcode Problem - 56 https://leetcode.com/problems/merge-intervals/ */
import java.util.*;
class MergeIntervals{
	
	public static void main(String args[]){
		
		int intervals[][] =  {{1,3},{2,6},{8,10},{15,18}};
		int output[][] = merge(intervals);
		System.out.print("[");
		for(int arr[] : output){
			
				System.out.print(Arrays.toString(arr) + " ");
		}
		System.out.print("]");
	}
	
	//Time complexity O(nlogn)
	public static int[][] merge(int[][] intervals){
		
		if(intervals.length<=1)
			return intervals;
		//sort the arrays according the starting point 
		Arrays.sort(intervals,(a,b)->(Integer.compare(a[0],b[0])));
		
		//Since each 2-d array has 1-d type of array elements
		List<int[]> list = new ArrayList<>();
		
		for(int[] inter : intervals){

			if(list.size() == 0 || inter[0] > list.get(list.size() - 1)[1]){
				list.add(inter);
			}else{
				//getting previous 1-d array for overlapping arrays
				//whichever ending point is greater
				list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1],inter[1]);
			}
		}
		return list.toArray(new int[list.size()][]);
	}
	
}