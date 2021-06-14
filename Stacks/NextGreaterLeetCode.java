import java.util.*;
class NextGreaterLeetCode{

	public static void main(String args[]){
	
		int arr1[] = {4,1,2};
		int arr2[] = {1,3,4,2};
		int res[] = new int[arr1.length];
		List<Integer> arrList = nextGreaterLeet(arr2);
		Collections.reverse(arrList);
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<arr2.length;i++){
			map.put(arr2[i],arrList.get(i));
		}
		
		for(int i = 0;i<arr1.length;i++){
			if(map.containsKey(arr1[i])){
				res[i]=map.get(arr1[i]);
			}
		}
		for(int i = 0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
		
	}
	
	public static List<Integer> nextGreaterLeet(int arr[]){
		
		List<Integer> arrList = new ArrayList<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = arr.length-1;i>=0;i--){
		
			if(stack.size() == 0){
				
				arrList.add(-1);
			
			}else if(stack.size()>0 && stack.peek()> arr[i]){
				
				arrList.add(stack.peek());
				
			}else if(stack.size()>0 && stack.peek()<= arr[i]){
				
				while(stack.size()>0 && stack.peek()<= arr[i]){
					stack.pop();
				}if(stack.size()==0){
					
					arrList.add(-1);
				}else{
					arrList.add(stack.peek());
				}
			}
			stack.push(arr[i]);
		}
		return arrList;
	
	}
}