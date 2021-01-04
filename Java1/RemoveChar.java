//Method which will remove any character from a given string
import java.util.*;
class RemoveChar
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println("Enter the character you want to remove");
		char c=sc.next().charAt(0);
		String d="";
		int flag=0;
		for(int i=0;i<s.length()-1;i++)
		{
				if(s.charAt(i)==c)
				{
					flag=1;
					d=d+s.substring(0,i)+s.substring(i+1);
				}
		}
		if(flag==0)
		{
			System.out.println("No such character present");
		}
		else
		{
			System.out.println("String after removal of specified character is "+d);
		}
	}
}
