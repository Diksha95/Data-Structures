/* https://webrewrite.com/find-intersection-two-arrays/ 
   The arrays are sorted and has distinct elements
*/
import java.util.*;
class IntersectingArrays{
	
	public static void main(String args[]){
		
	int arr1[] = {2, 3, 6, 7, 9, 11};
	int arr2[] = {4, 6, 8, 9, 12};
	
	printElements(arr1,arr2);
	}
	
	public static void printElements(int arr1[],int arr2[]){
		
		Set<Integer> hs=new HashSet<>();
		for(int val:arr1){
			hs.add(val);
		}
		
		for(int val:arr2){
			if(hs.contains(val)){
				System.out.print(val+" ");
			}
		}
	}
}