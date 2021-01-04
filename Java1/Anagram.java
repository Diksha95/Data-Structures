import java.util.*;
class Anagram
{
	public static void main(String...abc) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> map1=new HashMap<>();
		HashMap<Character,Integer> map2=new HashMap<>();
		System.out.println("Enter the string for checking anagrams");
		String s1=sc.next();
		String s2=sc.next();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(map1.containsKey(ch))
			{
				map1.put(ch,map1.get(ch)+1);
			}
			else
			{
				map1.put(ch,1);
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(map2.containsKey(ch))
			{
				map2.put(ch,map2.get(ch)+1);
			}
			else
			{
				map2.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer>)
	}
}