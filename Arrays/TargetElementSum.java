import java.util.*;
class TargetElementSum{

	public static void main(String args[]){
	
		int arr[] = {3,3,5,5,7,2,2,1,8};
		int k = 10;
		
		getTargetSum(arr,k);
		hashTargetSum(arr,k);
	}
	//Complexity O(n.logn)
	public static void getTargetSum(int A[] ,int sum){
	
        Arrays.sort(A);
 
        int low = 0;
        int high = A.length - 1;
 
        while (low < high)
        {
            // sum found
            if (A[low] + A[high] == sum)
            {
                System.out.println("Pair found (" + A[low] + ", " + A[high] + ")");
				low++;
				high--;
            }
 
            if (A[low] + A[high] < sum) {
                low++;
            }
            else {
                high--;
            }
        }
	}
	//Time Complexity O(n) Space Complexity O(n)
	public static void hashTargetSum(int arr[],int k){
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : arr){
			int temp = k - i;
			
			if(set.contains(temp)){
				System.out.println("Pair is : ("+ temp + "," + i + ")");
			}
			set.add(i);
		}
	}
}