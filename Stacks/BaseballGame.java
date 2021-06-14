/*Leetcode : 682 https://leetcode.com/problems/baseball-game/
Complexity :O(n)
*/
import java.util.*;
class BaseballGame{
	
	public static void main(String args[]){
	
		String ops[] = {"5","-2","4","C","D","9","+","+"};
		
		System.out.println(calPoints(ops));
	}
	
	public static int calPoints(String ops[]){
	
		Stack<Integer> stack = new Stack<Integer>();
		int res = 0;
		for(int i = 0;i<ops.length;i++){
		
			if(!stack.isEmpty() && ops[i].equals("C")){
				stack.pop();
			}
			else if(!stack.isEmpty() && ops[i].equals("D")){
				
				int ele = stack.peek();
				stack.push(ele*2);
			}
			else if(!stack.isEmpty() && ops[i].equals("+")){
				int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
			}
			else{
				stack.push(Integer.parseInt(ops[i]));
			}
		}
		while(!stack.isEmpty()){
			res+=stack.pop();
		}
		return res;
	}
}