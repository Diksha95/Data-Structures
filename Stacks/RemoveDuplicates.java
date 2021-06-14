/* https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/ Leetcode : 1047
Complexity O(n)*/
import java.util.*;
class RemoveDuplicates{
	
	public static void main(String args[]){
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}
	
	public static String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch :s.toCharArray()){   //Iterating through the character array and checking whether 
										 //current char is equal to top of stack
            if(!stack.isEmpty() && stack.peek() ==ch){
				stack.pop();
			}else{
				stack.push(ch);
			}
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){   //at this point only distinct elements are remaining 
			sb.append(stack.pop());
		}
        return sb.reverse().toString();
    }
}