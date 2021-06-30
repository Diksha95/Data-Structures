/* Time Complexity : O(n) 
https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0 */
class SortZeroOnes
{
	public static void main(String args[]){
	
		int arr[] = {0,2,1,2,0};
		sort012(arr,arr.length);
		for(int i:arr){
			System.out.print(i+" ");
		}
	
	}
	//Complexity is O(n) + O(n) = O(2n)
    public static void sort012(int a[], int n)
    {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            switch (a[i]) {
            case 0:
                count0++;
                break;
            case 1:
                count1++;
                break;
            case 2:
                count2++;
                break;
            }
        }
        
        int i = 0;
        while(count0 > 0){
            a[i++] = 0;
            count0--;
        }
        while(count1 > 0){
            a[i++] = 1;
            count1--;
        }
        while(count2 > 0){
            a[i++] = 2;
            count2--;
        }
    }
	//Better approach single pass
	public void sortColors(int[] nums) {
        int lo = 0; 
        int hi = nums.length - 1; 
        int mid = 0; 
        int temp; 
        while (mid <= hi) { 
            switch (nums[mid]) { 
                case 0: { 
                    temp = nums[lo]; 
                    nums[lo] = nums[mid]; 
                    nums[mid] = temp; 
                    lo++; 
                    mid++; 
                    break; 
                } 
                case 1: 
                    mid++; 
                    break; 
                case 2: { 
                    temp = nums[mid]; 
                    nums[mid] = nums[hi]; 
                    nums[hi] = temp; 
                    hi--; 
                    break; 
                } 
            } 
        }
    }
}