class MergeSortedLeet{
	
	public static void main(String args[]){
	
		int arr1[] = {1,2,3,0,0,0};
		int arr2[] = {2,5,6};
		
		merge(arr1,3,arr2,3);
		for(int i:arr1){
			
			System.out.print(i+" ");
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int l = m + n - 1;
        int p = m -1;
        int q = n - 1;
        while(p>=0 && q>=0){
            
            //putting largest at last of the nums1 array
            if(nums1[p] >= nums2[q]){
                nums1[l--] = nums1[p--];
            }else{
                nums1[l--] = nums2[q--];
			}	
		}
        while(p>=0){
            nums1[l--] = nums1[p--];
        }
        while(q>=0){
            nums1[l--] = nums2[q--];
        }
	}
}