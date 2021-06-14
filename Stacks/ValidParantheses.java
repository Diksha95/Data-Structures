import java.util.*;
/* Leetcode : 20
Parantheses will be valid if stack is empty
*/
class ValidParantheses{

	public static void main(String args[]){
	
		String s = "([)]";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		for(char c:s.toCharArray()){
			
			if(!stack.empty() && match(stack.peek(),c)){
				stack.pop();
			}else{
				stack.push(c);
			}
		}
		return stack.empty();
	}
	
	public static boolean match(char peek,char c){
		
		return peek =='(' && c == ')' ||
			   peek =='{' && c == '}' ||
			   peek =='[' && c == ']';
	}
}