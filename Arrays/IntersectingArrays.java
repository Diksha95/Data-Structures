/* https://webrewrite.com/find-intersection-two-arrays/ 
   The arrays are sorted and has distinct elements
*/
import java.util.*;
class IntersectingArrays{
	
	public static void main(String args[]){
		
		int arr1[] = {2, 3, 6, 7, 9, 11};
		int arr2[] = {4, 6, 8, 9, 12};
	
		int arr3 [] = intersection(arr1,arr2);
		for(int i:arr3){
			
			System.out.print(i+ " ");
		
		}
	}
	
	//Time complexity O(n) Space O(n)
	public static int[] intersection(int[] nums1, int[] nums2) {
		
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
	
	//Time complexity: O(nlogn) Space : O(n)
    public static int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }
}