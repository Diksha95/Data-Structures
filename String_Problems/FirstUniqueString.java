import java.util.*;
class FirstUniqueString {
	
	public static void main(String args[]){
		
		String s = "leetcode";
		String st = "LeetCode";
		//System.out.println(firstUniqChar(s));
		//System.out.println(firstUniqCharSecond(st));
		System.out.println(firstUniqCharLowerCase(st));
	}
	//Space o(n) Complexity 
    public static int firstUniqChar(String s) {
        
        Map<Character,Integer> map = new LinkedHashMap<>();
        //t indexArry[] = new int[s.length];
        for(int i = 0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            if(map.containsKey(ch)){
                int fre = map.get(ch) + 1;
                map.put(ch,fre);
            }else{
                map.put(ch,1);
            }
        }
        
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            
            if(e.getValue()== 1){
                return s.indexOf(e.getKey());
            }
        }
        return -1;
    }
	
	//Complexity O(n) and for all letters ,for lowercase we can use count array of 26
	//Space o(n) Complexity 
    public static int firstUniqCharSecond(String s) {
        
       int count[] = new int[256];
        for(int i = 0;i<s.length();i++){
            
			count[s.charAt(i)]++;
        }
		
		for(int i = 0;i<s.length();i++){
            
			if(count[s.charAt(i)] ==1)
				return i;
        }
        return -1;
    }
	
	public static int firstUniqCharLowerCase(String s) {
        
       int count[] = new int[26];
        for(int i = 0;i<s.length();i++){
            
			count[s.charAt(i) - 'a']++;
        }
		
		for(int i = 0;i<s.length();i++){
            
			if(count[s.charAt(i)] ==1)
				return i;
        }
        return -1;
    }
	
}