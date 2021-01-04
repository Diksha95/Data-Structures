import java.util.*;
class PrimeN
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=Prime(i);
			if(k==1)
			{
				System.out.print(i+"\t");
			}
		}
	}
	static int Prime(int num)
	{		int flag,c=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			flag=1;
		}
		else
		{
			flag=0;
		}
		return flag;
	}

}