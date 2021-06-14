import java.util.*;
class MaxOfAllSubArray{

	public static void main(String args[]){
	
		int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
		
		System.out.println(getMaximumOfAll(arr,3));
	}

	//Getting array index of out bound exception for this
	public static List<Integer> getMaximumOfAll(int arr[],int K){
	
		int i = 0;
		
		Deque<Integer> deque = new LinkedList<>();
		
		List<Integer> result = new ArrayList<>();
		
		for(int j = 0;j< arr.length;j++){
			
			//Here we will check if elements in the list are smaller the current jth element
			//if yes then we will remove all
			while(!deque.isEmpty() && deque.peekLast() < arr[j]){
				deque.pollLast();
			}
			//then adding the current j
			
			deque.add(arr[j]);
			
			if(j-i+1==K){
				
				result.add(deque.peekFirst());
				
				if(deque.peekFirst() == arr[i]){
					deque.pollFirst();
				}
				i++;
			}
		}
		return result;
	}
}