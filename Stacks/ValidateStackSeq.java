/*Leetcode : 946 https://leetcode.com/problems/validate-stack-sequences/ 
  Time Complexity : O(n)
  Space Complexity : O(n) since we are using stack
*/
import java.util.*;
class ValidateStackSeq{

	public static void main(String args[]){
		int pushed[] = {1,2,3,4,5};
		int popped[] = {4,5,3,2,1};
		
		System.out.println(validateStackSequences(pushed,popped));
	
	}
	
	public static boolean validateStackSequences(int pushed[],int popped[]){
		Stack<Integer> stack = new Stack<>();
		int i = 0,n = pushed.length;
		for(int item : pushed){
			stack.push(item);
			while(!stack.empty() && stack.peek() == popped[i]){
				stack.pop();
				++i;
			}
		}
		return i == n;
	}
}