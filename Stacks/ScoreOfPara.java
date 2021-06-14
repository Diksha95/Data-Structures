/*Leetcode :856 https://leetcode.com/problems/score-of-parentheses/ 
T(n) :O(n)
S(n) : O(n) stack used
*/
import java.util.*;
class ScoreOfPara{

	public static void main(String args[]){
	
		String s = "(()(()))";
		
		System.out.println(scoreOfParentheses(s));
	}
	
	public static int scoreOfParentheses(String s) {
		Stack<String> stack = new Stack<>();
		for(char c :s.toCharArray()){
			int innerScore = 0;
			if(stack.empty()){
				stack.push(c+"");
			}else{
				if(c == ')'){
					while(!stack.empty() && !stack.peek().equals("(")){
						innerScore += Integer.parseInt(stack.pop());
					}
					stack.pop();
				
					//() this condition happend
					if(innerScore == 0){
						stack.push("1");
					}else{
						stack.push(2*innerScore + "");
					}
				}else{
					stack.push(c+"");
				}	
			}
		}
		int score = 0;
		while(stack.size()>0){
			score += Integer.parseInt(stack.pop()); 
		}
		return score;
    }

}