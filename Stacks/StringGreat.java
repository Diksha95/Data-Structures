/* Leetcode :1544 */
import java.util.*;
class StringGreat{

	public static void main(String args[]){
	
		String s = "abBAcC";
		
		System.out.println(makeStringGreat(s));
	
	}
	/*It should be noted that the difference between the any lowercase and uppercase 
	alphabet is 32. Example - ASCII value of a is 97 and A is 65 , 97-65 = 32 */
	
	
	public static String makeStringGreat(String s){
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i< s.length();i++){
			
			if(!stack.isEmpty() && Math.abs(stack.peek()-s.charAt(i)) ==32){
				stack.pop();
			}else{
			
				stack.push(s.charAt(i));
			}
		
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}
}