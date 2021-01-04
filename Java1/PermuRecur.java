import java.util.*;
class PermuRecur
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print("Permutation of the string are: ");
		premute(s,0,s.length()-1);

	}
	static void premute(String s,int l,int r)
	{
		if(l==r)
			System.out.print(s+" ");
		else
		{
			for(int i=l;i<s.length();i++)
			{
				s=swap(s,l,i);
				premute(s,l+1,r);
				s=swap(s,l,i);
			}
		}
	}
	static String swap(String s,int i,int j)
	{
			char ch[]=s.toCharArray();
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			return String.valueOf(ch);
	}
}