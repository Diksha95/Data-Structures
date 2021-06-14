/* https://leetcode.com/problems/valid-mountain-array/ */
class ValidMountainArray{

	public static void main(String args[]){
		
		int arr[] = {0,2,3,4,5,2,1,0};
		System.out.println(isValidMountain(arr));
	}
	
	public static boolean isValidMountain(int arr[]){
		
		int n = arr.length;
		int i = 0;
		//incrementing index till we found elements decreasing and decreasing index element
		while(i < n-1 && arr[i] < arr[i+1]){
			i++;
		}
		//i = 0 means no increasing sequence
		// i = n-1 means no elements left for decreasing sequence
		if(i == 0 || i == n-1) return false;
			
		while(i < n-1 && arr[i] > arr[i+1]){
			i++;
		}
		return i == n-1;
	}
}