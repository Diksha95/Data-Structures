/* Leetcode :155 https://leetcode.com/problems/min-stack/ 
   Time Complexity : O(1) for push,pop and getMin operation
   Space Complexity : O(n) extra stack is used
*/
import java.util.*;
class MinStackExtraSpace{

	static Stack<Integer> stack = new Stack<>();
	static Stack<Integer> suppStack = new Stack<>();
	public static void main(String args[]){
		
		System.out.println("Get Min element after inserting 18,19,29");
		push(18);
		push(19);
		push(29);
		System.out.println(getMin());
		System.out.println("Get Min element after inserting 15");
		push(15);
		System.out.println(getMin());
		pop();
		System.out.println("Get Min element after popping 15");
		System.out.println(getMin());
		System.out.println("Get Min element after inserting 16");
		push(16);
		System.out.println(getMin());
		
	}
	
	public static void push(int item){
	
		stack.push(item);
		if(suppStack.size() ==0 || suppStack.peek() >= item){
			suppStack.push(item);
		}
	}
	
	public static int pop(){
		if(stack.size() == 0)
			return -1;
		int ans = stack.pop();
		
		if(suppStack.peek() == ans){
			suppStack.pop();
		}
		return ans;
	}
	
	public static int getMin(){
		if(suppStack.size() == 0)
			return -1;
		return suppStack.peek();
	}

}