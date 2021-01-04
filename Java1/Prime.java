import java.util.*;
class Prime
{
	public static void main(String arr[])
	{
		int n1,n2;
		System.out.println("Enter the value of two range");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			int x=CheckPrime(i);
			if(x==1)
				System.out.print(i+"\t");
		}
	}
	static int CheckPrime(int n)
	{		int count=0;
			int flag=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			{
				flag=1;
				return flag;
			}
			return 0;
	}

}