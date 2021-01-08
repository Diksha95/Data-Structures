/* https://practice.geeksforgeeks.org/problems/run-length-encoding/1 
Time Complexity - O(n) n: no of characters */
import java.util.*;
class RunLengthEncoding{
	
	public static void main(String args[]){
		
		String s="wwwwaaadexxxxxx";
		
		System.out.println(runLengthEncoder(s));
	}
	
	public static String runLengthEncoder(String s){
		StringBuilder des=new StringBuilder();
		
		for(int i=0;i<s.length();i++){
			
			int count=1; //because counting the number from which we have started
			while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
				
				count++;
				i++;
			}
			des.append(s.charAt(i));
			des.append(count);
		}
		
		return des.toString();
	}
}