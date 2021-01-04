import java.util.*;
class LongestPalin
{
	static boolean Palin(String s)
	{
		String d="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			d=d+ch;
		}
		if(d.equals(s))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sub="";
		String longPa="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				sub=s.substring(i,j);
				if(Palin(sub)==true)
				{longPa=sub;}
				if(sub.length()>longPa.length())
				{
					longPa=sub;
				}
			}
		}
		System.out.println("Longest palindrome of string is "+longPa);
	}
}