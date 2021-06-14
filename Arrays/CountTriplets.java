import java.util.*;
class CountTriplets{

	public static void main(String args[]){
	
		int arr[] = {1,1,1,2,2};
		
		//System.out.println(getCountOfTriplets(arr));
		System.out.println(countTripletsTwo(arr));
	}

	//O(n2) and space O(n)
	public static int getCountOfTriplets(int arr[]){
		
		int count = 0;
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0;i< arr.length;i++){
			
			map.put(arr[i],1);
		
		}
		
		for(int i = 0;i<arr.length;i++){
			
			for(int j = i+1;j<arr.length;j++){
				
				if(map.containsKey(arr[i]+arr[j])){
					count++;
				}
			}
		}
		if(count == 0){
			return -1;
		}else{
			return count;
		}
	}
	
	//O(n2) and space O(1)
	public static int countTripletsTwo(int arr[]){
		
		Arrays.sort(arr);
		int n = arr.length;
		int count = 0;
		for(int i = 0;i< n-2;i++){
			
			int j = i+1;
			int k = j+1;
			
			while(k<n){
			
				if(arr[i] + arr[j] == arr[k]){
					count++;
					j++;
				}
				else if(arr[i]+arr[j] < arr[k]){
					j++;
					k--;
				}
				k++;
			}
		}
		return count;
	}
}