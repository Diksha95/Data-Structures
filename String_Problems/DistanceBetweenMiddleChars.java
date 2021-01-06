/* Given a String and two words (which occur in the given string), find the minimum distance between two words. 
Distance between two words is defined as the number of characters between the given two words’ middle characters. */

import java.util.*;
class DistanceBetweenMiddleChars{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s="The quick brown fox jumps over the lazy dog";
		String s1="geeks for geeks contribute practice";
		String w3="geeks";
		String w4="practice";
		String w1="brown";
		String w2="dog";
		System.out.println("Minimum Distance between w1 and w2 is :"+minDistance(s1,w3,w4));
		
	}
	public static int minDistance(String s,String w1,String w2){
		
		String [] words=s.split(" ");
		int a=0,b=0,distanceBetween=0;
		if(w1.equals(w2)){
			return 0;
		}
		for(int i=0;i< words.length;i++){
			
			if(words[i].equals(w1)){
				a=i;
			}
			if(words[i].equals(w2)){
				b=i;	
			}		
		}
		
		for(int j=a;j<=b;j++){
			
			if(j==a || j==b){
				distanceBetween+=words[j].length()/2;
			}
			else
				distanceBetween+=words[j].length();
		}
		return distanceBetween;
	}
}