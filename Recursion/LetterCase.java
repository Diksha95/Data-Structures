/* https://leetcode.com/problems/letter-case-permutation/ 
Leetcode Problem :784
*/
import java.util.*;
class LetterCase{
	public static void main(String args[]){
	
		String input="a1B2";
		String output="";
		Set<String> res=new HashSet<>();
		solve(input,output,res);
		System.out.println(res);
	
	}
	public static void solve(String input,String op,Set<String>res){
		if(input.length()==0){
			res.add(op);
			return;
		}
		if(Character.isAlphabetic(input.charAt(0))){
			String op1=op;
			String op2=op;
			op1+=Character.toLowerCase(input.charAt(0));
			op2+=Character.toUpperCase(input.charAt(0));
			solve(input.substring(1),op1,res);
			solve(input.substring(1),op2,res);
		}else{
			String op1=op;
			op1+=input.charAt(0);
			solve(input.substring(1),op1,res);
		}
	}
}