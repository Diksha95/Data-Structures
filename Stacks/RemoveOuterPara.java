/* Leetcode : 1021
https://leetcode.com/problems/remove-outermost-parentheses/
*/
class RemoveOuterPara{

	public static void main(String args[]){
	
		String s = "(()())(())";
		
		System.out.println(removeOuterParentheses(s));
	
	}

	public static String removeOuterParentheses(String s){
	
		StringBuilder sb = new StringBuilder();
		
		int countOuter = 0;
		for(char c:s.toCharArray()){
			
			if(c == '('){
				if(countOuter!=0) { sb.append(c);}
				countOuter++;
			}
			else{
				countOuter--;
				if(countOuter!=0) { sb.append(c);}
			}
		}
		return sb.toString();
	}
}