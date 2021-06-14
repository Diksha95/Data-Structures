import java.util.*;
class MakeValidPara{

	public static void main(String args[]){
	
		String s = "()))((";
		
		System.out.println(minAddToMakeValid(s));
		System.out.println(minAddToMakeValid2(s));
		
	}
	
	//Stack approach
	public static int minAddToMakeValid(String s){
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()){
			
			if(c == ')' && !stack.empty() && stack.peek() =='(' ){
				stack.pop();
			}else{
				stack.push(c);
			}
		
		}
			return stack.size();
	}
	
	//without stack approach
	public static int minAddToMakeValid2(String s){
		while(s.contains("()")){
			s = s.replace("()","");
		}
		return s.length();
	}
}