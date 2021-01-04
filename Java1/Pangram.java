import java.util.*;
import java.lang.*;
class Pangram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check for pangram");
		String s=sc.nextLine();
		char ch[]=s.toLowerCase().toCharArray();
		Set<Character> set=new HashSet<>();
		for(char c: ch)
		{
			if(Character.isLetter(c) && (!Character.isWhitespace(c)))
			set.add(c);
		}
		System.out.println(set.size());
		if(set.size()==26)
		{
			System.out.println("String is pangram");
		}
		else
			System.out.println("String is not pangram");
	}
}