/* Leetcode : 844 */
import java.util.*;
class StringCompare{

	public static void main(String args[]){
	
		String S ="ab#c";
		String T ="ad#c";
		
		System.out.println(stringCompare2(S).equals(stringCompare2(T)));
	
	}
	//complexity of O(n) and extra space used so O(n)
	public static String stringCompare(String s){
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : s.toCharArray()){
		
			if(c!='#'){
				stack.push(c);
			}else{
				stack.pop();
			}
		
		}
		return stack.toString();
	
	}
	//Complexity O(n) and space of O(1)
	public static String stringCompare2(String s){
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()){
		
			if(c!='#'){
				sb.append(c);
			}else if(sb.length()!=0){
				sb.deleteCharAt(sb.length()-1);
			}
		}
		
		return sb.toString();
	
	}

}