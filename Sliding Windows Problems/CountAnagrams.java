/* Problem : Leetcode #438
https://leetcode.com/problems/find-all-anagrams-in-a-string/
https://www.geeksforgeeks.org/count-occurrences-of-anagrams/ */

import java.util.*;
class CountAnagrams{

	public static void main(String args[]){
		
		String s = "forxxorfxdofr";
		String pattern = "for";
		
		System.out.println(getCountOccurences(s,pattern));
	}

	public static int getCountOccurences(String str,String pattern){
	
		int i = 0,j=0;
		int k = pattern.length();
		int ans = 0;
		Map<Character,Integer> map = getMapForPattern(pattern);
		int count = map.size();
		
		while(j<str.length()){
			
		// if character is present in map then,
		//reducing its count from map and decrementing count also
		
			if(map.containsKey(str.charAt(j))){
				
				map.put(str.charAt(j),map.get(str.charAt(j))-1);
				
				if(map.get(str.charAt(j))==0){
						count--;
					}
			}
			
			if(j-i+1<k) {
				j++;
			}
			
			else if(j-i+1==k){
				
				if(count ==0){
					ans++;
				}
				
				if(map.containsKey(str.charAt(i))){
					
					map.put(str.charAt(i),map.get(str.charAt(i))+1);
					
					if(map.get(str.charAt(i))==1){
						count++;
					}
					
				}
				i++;
				j++;
			}
		}
		return ans;
	}
	
	public static Map<Character,Integer> getMapForPattern(String pattern){
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i < pattern.length();i++){
			
			char ch = pattern.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
				map.put(ch,1);
			}
		}
		return map;
	}
}