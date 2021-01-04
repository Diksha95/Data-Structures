import java.util.*;
class StringPalindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String rev=reverse(s);
		if(rev.equals(s))
		{
			System.out.println("is Palindrome");
		}
		else
		{
			System.out.println("is not Palindrome");
		}
	}
	static String reverse(String s)
{	String d="";
	for(int i=s.length()-1;i>=0;i--)
	{
		char ch=s.charAt(i);
		d=d+ch;
	}
	//System.out.println(d);
	return d;
}
}