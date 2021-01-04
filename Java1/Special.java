import java.util.Scanner;
class Special
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res=reverse(s);
		System.out.println(res);
	}
	static String reverse(String s)
	{
		char ch[]=s.toCharArray();
		int l=0;
		int r=ch.length-1;
		while(true)
		{
			while(l<r && !Character.isLetterOrDigit(ch[l]))
				l++;
			while(r>=0 && !Character.isLetterOrDigit(ch[r]))
				r--;
			if(l<r)
			{
				swap(ch,l,r);
			}
			else
			{
				break;
			}
			l++;
			r--;
		}
		return new String(ch);
	}
	static void swap(char ch[],int l,int r)
		{
				char temp=ch[l];
				ch[l]=ch[r];
				ch[r]=temp;
			}
		
}