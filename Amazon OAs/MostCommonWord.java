/* LeetCode Problem  819 */
import java.util.*;
class MostCommonWord{
	
	public static void main(String args[]){
		
	String paragraph="Bob hit a ball, the hit BALL flew far after it was hit.";
	String banned[]= {"hit"};
	
	System.out.println("The most common word is "+mostCommonWord(paragraph,banned));
	}
	
	public static String mostCommonWord(String paragraph,String [] banned){
		
		String [] words = paragraph.split("\\W+");
		
		//Adding words in hashset in order to decrease loopkup complexity to O(1)
		Set<String> bannedSet=new HashSet<>();
		
		//To check frequency of every character and repeat the most frequent character which is not a banned word
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String i:banned){
			bannedSet.add(i);
		}
		String mostCommon="";
		for(String j:words){
			//Becoz every word in banned array is of lowercase
			String lowerCaseWord =j.toLowerCase();
			
			if(!bannedSet.contains(lowerCaseWord)){
				
				if(!map.containsKey(lowerCaseWord)){
					map.put(lowerCaseWord,1);
				}
				
				map.put(lowerCaseWord,map.get(lowerCaseWord)+1);
				
				if(mostCommon.isEmpty() || map.get(lowerCaseWord)>map.get(mostCommon)){
					
					mostCommon=lowerCaseWord;
				}
			}
		}
		return mostCommon;
	}
}