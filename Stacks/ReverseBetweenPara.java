/* Leetcode : 1190 
https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/ 
Time Complexity : O(n2)
*/
import java.util.*;
class ReverseBetweenPara{
	
	public static void main(String args[]){
	
		String s = "(u(love)i)";
		
		System.out.println(reverseParentheses(s));
	}
	
	public static String reverseParentheses(String s){
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()){
			if(c == ')'){
				StringBuilder sb = new StringBuilder();
				//Popping out the words 
				while(!stack.empty() && stack.peek()!='(' ){
					sb.append(stack.pop());
				}
				//Popping out the opening bracket as we don't need it.
				stack.pop();
				
				//Pushing the reversed string again inside the stack
				for(char ch :sb.toString().toCharArray()){
					stack.push(ch);
				}
			}else{
				stack.push(c);
			}
		}
		StringBuilder res = new StringBuilder();
		while(!stack.empty()){
			res.append(stack.pop());
		}
		return res.reverse().toString();
	}

}