import java.util.*;
class FindKthSmallestElement{

	public static void main(String args[]){
	
	int arr [] = {0,1,0,1,1,1,1,0,0,1};
	int K = 4;
	List<Integer> arrayList = new ArrayList<>();
	for(int i:arr){
		arrayList.add(i);
	}
	Collections.sort(arrayList);
	getKthSmallest(arrayList,K);
	System.out.println(getKthSmallestFromArray(arr,K));
	}
	
	public static void getKthSmallest(List<Integer> arrList,int k){
	
		HashSet<Integer> hashSet = new HashSet<>(arrList);
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.addAll(hashSet);
		if(arr1.size() < k)
			System.out.println("null");
		else
		System.out.println(arr1.get(k-1));
	}
	
	public static int getKthSmallestFromArray(int arr[],int k){
		Arrays.sort(arr);
		int []arr1 = removeDuplicates(arr);
		if(arr1.length <k)
			return 0;
		else
		return arr1[k-1];
	}
	
	public static int[] removeDuplicates(int arr[]){
		
		int j = 0;
		if(arr.length == 0 || arr.length == 1){
			return arr;
		}
		
		for(int i = 0;i< arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length-1];
		return arr;
	}
}