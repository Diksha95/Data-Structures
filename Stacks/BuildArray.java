/* Leetcode : 1441 
https://leetcode.com/problems/build-an-array-with-stack-operations/
Complexity O(target.length + n)
*/
import java.util.*;
class BuildArray{

	public static void main(String args[]){
	
		int target[] = {1,3};
		int n = 3;
		/* List<String> arrList = buildArray(target,n);
		arrList.stream().forEach(System.out::println);
		 */
		List<String> arrList2 = buildArraySecond(target,n);
		arrList2.stream().forEach(System.out::println);
	}
	
	public static List<String> buildArray(int target[],int n){
		
		List<String> list = new ArrayList<String>();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=target.length-1;i>=0;i--){
			stack.push(target[i]);
		}
		
		for(int i = 1;i<=n;i++){
		
			if(stack.peek() == i){
				list.add("Push");
				stack.pop();
			}else if(!stack.isEmpty() && stack.peek()!=i){
				list.add("Push");
				list.add("Pop");
			}
		}
		return list;
	}
	
	public static List<String> buildArraySecond(int target[],int n){
		
		int j = 0;
		List<String> list = new ArrayList<String>();
		for(int i = 1;i<=n && j<target.length;i++){
			list.add("Push");
			if(target[j]==i){
				j++;
			}else{
				list.add("Pop");
			}
		}
		return list;
		
	}
}