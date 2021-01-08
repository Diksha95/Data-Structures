import java.util.*;
class MedianOfSortedArrays{

	public static void main(String args[]){
	
	int arr1[]={1,12,15,26,38};
	int arr2[]={2,13,17,30,45};
	int n=arr1.length;
	System.out.println("The median of two sorted arrays are "+findMedianSortedArrays(arr1,arr2));
	}
	
	//O(m+n)
	public static int medianArray(int arr1[],int arr2[],int n){  
	
	int k=0;
	int arr3[]=new int[2*n];
	while(k<arr3.length){
		for(int i=0;i<n;i++){
			arr3[k]=arr1[i];
			k++;
		}
		for(int j=0;j<n;j++){
			arr3[k]=arr2[j];
			k++;
		}
	}
	Arrays.sort(arr3);
	
	return (arr3[n-1]+ arr3[n])/2;
	
	}
	//O(log(min(m,n)))
	  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
          // This will ensure that we will always apply binary search on the array of smaller length
        if(nums1.length > nums2.length)return findMedianSortedArrays(nums2,nums1);
        int x = nums1.length;
        int y = nums2.length;
        int low = 0;
        int high = x;
        while(low<=high){
              //This will work for both even and odd length arrays
            int partX =  (low+high)/2;
            int partY =  (x+y+1)/2 - partX;
            int xLeft = partX == 0 ? Integer.MIN_VALUE : nums1[partX-1];
            int xRight = partX == x ? Integer.MAX_VALUE : nums1[partX];
            int yLeft = partY == 0 ? Integer.MIN_VALUE : nums2[partY-1];
            int yRight = partY == y ? Integer.MAX_VALUE : nums2[partY];
            if(xLeft<=yRight && yLeft<=xRight){
               if((x+y)%2==0){
                   return ((double)Math.max(xLeft,yLeft) + Math.min(xRight,yRight))/2;
               }else{
                   return Math.max(xLeft,yLeft);
               } 
            }else if(xLeft>yRight){
                high = partX -1;
            }else{
                low = partX+1;
            }
        }
        return 0;
    }
	
}