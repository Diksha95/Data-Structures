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
}