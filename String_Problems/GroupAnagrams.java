/* Put Anagrams into different groups */ 
class GroupAnagrams{
	
	public static int groupAnagrams(List<String> words){
		
		for(int i=0;i< words.size();i++){
			
			
		}
	}
	
	public void checkAnagrams(String s1,String s2){
		
		if(s1.length()!= s2.length())
			return false;
		else{
			char ch1[] = s1.toLowerCase().toCharArray();
			char ch2[] = s2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			return Arrays.equals(ch1,ch2);
		}
	}
	
	public static void main(String args[]){
		
		String word[] = {"cat","dog","god","act","inch","chin","kit"};
		List<String> words = new ArrayList<String>();
		for(int i = 0;i<word.length();i++){
			words.add(word[i]);
		}
		groupAnagrams(words);
	}
}