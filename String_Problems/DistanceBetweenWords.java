https://www.geeksforgeeks.org/minimum-distance-between-words-of-a-string/
import java.util.*;
class DistanceBetweenWords{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s="geeks for geeks contribute practice";
		String w1="geeks";
		String w2="practice";
		System.out.println("Minimum Distance between w1 and w2 is :"+minDistance(s,w1,w2));
		
	}
	public static int minDistance(String s,String w1,String w2){
		
		String [] words=s.split(" ");
		int a=0;
		int b=0;
		int currentIndex=0;
		int minDistance=(words.length)+1;
		if(w1.equals(w2)){
			return 0;
		}
		for(int i=0;i< words.length;i++){
			
			if(words[i].equals(w1))
					a=i;
					
					if(words[i].equals(w2))
						b=i;	
		}
			
		return minDistance=Math.min(minDistance,Math.abs(a-b)-1);
	}
}