import java.util.*;
class PatternBosch
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int k=1;k<=n;k++)
		{
			System.out.print(n);
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(n%2==0)
				{
					if(j==n/2)
					{
						System.out.print(i);
					}
					else
					{
						System.out.print(n);
					}
				}
				else if(n%2==1)
					{
					if(j==(n+1)/2)
					{
						System.out.print(i);
					}
					else
					{
						System.out.print(n);
					}
				}
			}
			System.out.println();
		}
	}
}