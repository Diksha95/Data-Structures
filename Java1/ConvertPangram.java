import java.util.*;

class ConvertPangram
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check for pangram");
		String s=sc.nextLine();
		System.out.println("Enter the element to make string pangram");
		int k=sc.nextInt();
		int count=0;
		char ch[]=s.toLowerCase().toCharArray();
		Set<Character> set=new HashSet();
		for(char c: ch)
		{
			if(Character.isLetter(c) && (!Character.isWhitespace(c)))
			set.add(c);
			count++;
		}
		if(count+k>=26)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("Not pangram");
		}
		// System.out.println(set.size());
		// if(set.size()==26)
		// {
		// 	System.out.println("String is pangram");
		// }
		// else
		// 	System.out.println("String is not pangram");
	}
}