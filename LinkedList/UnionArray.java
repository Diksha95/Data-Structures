import java.util.*;
class UnionArray{
	
	public static void main(String args[]){
		
		int arr1[] = { 7, 1, 5, 2, 3, 6};
		int arr2[] = {3, 8, 6, 20, 7,3 };
		
		List<Integer> list = getUnionOfArrays(arr1,arr2);
		
		for(int i : list){
			
			System.out.print(i+ " ");
		}
		
		int size = doUnion(arr1,arr2,arr1.length,arr2.length);
		System.out.println("Size of the array : "+size);
	}
	//Solution is good for sorted arrays O(n+m))
	public static List<Integer> getUnionOfArrays(int arr1[],int arr2[]){
		
		int i = 0; int j = 0; int k = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(i<arr1.length && j<arr2.length){
			
			if(arr1[i] == arr2[j]){
				
				if(!list.contains(arr1[i])){
					list.add(arr1[i]);
				}
				i++;
				j++;
			}else if (arr1[i] < arr2[j]){
				if(!list.contains(arr1[i])){
					list.add(arr1[i]);
				}
				i++;
			}else{
				if(!list.contains(arr2[j])){
					list.add(arr2[j]);
				}
				j++;
			}
		}
		while(i<arr1.length){
			if(!list.contains(arr1[i])){
					list.add(arr1[i]);
				}
				i++;
		}
		while(j<arr2.length){
			if(!list.contains(arr2[j])){
					list.add(arr2[j]);
				}
				j++;
		}
		return list;
	}
	// Solution for unsorted arrays O(n+m) Space O(n+m)
	 public static int doUnion(int arr1[],int arr2[],int n,int m) {
		 
        Set<Integer> set = new LinkedHashSet<>();
        
        for(int i = 0;i<n;i++){
            
            set.add(arr1[i]);
        }
        for(int j = 0;j<m;j++){
            
            set.add(arr2[j]);
        }
        
		System.out.println(set);
        return set.size();
    }
}