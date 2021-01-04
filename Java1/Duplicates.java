import java.util.*;
class Duplicates
{
	public static void main(String[] args) {
		
		String s=new String("aaabcgcgdbbbcccdcfff");
		char ch[]=s.toCharArray();
		Set<Character> set=new LinkedHashSet<Character>();
		for(char c: ch)
		{
			set.add(c);
		}
		StringBuilder sb=new StringBuilder();
		for(Character chr: set)
		{
			sb.append(chr);
		}
		System.out.println(sb.toString());
	}
}