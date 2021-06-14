/* Leetcode : 1249 https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
   Complexity : O(n)
*/
import java.util.*;
class MinRemoveValid{

	public static void main(String args[]){
		
		String s = "lee(t(c)o)de)";
		
		System.out.println(minRemoveToMakeValid(s));
	}
	
	public static String minRemoveToMakeValid(String s){
	
		StringBuilder sb = new StringBuilder();
        int open = 0;
        for(char c : s.toCharArray()){
            
            if(c == '('){
                open++;
            }else if(c == ')'){
                if(open == 0) continue ; //Skipping those extra closing brackets
                open --;
            }
            sb.append(c);
        }
        
        StringBuilder res = new StringBuilder();
        //Loop to check whether extra opening brackets are present
        for(int i =sb.length()-1 ;i>=0;i--){
            if(sb.charAt(i) == '(' && open -- >0) continue;
            res.append(sb.charAt(i));
        }
        
        return res.reverse().toString();
	}
}
