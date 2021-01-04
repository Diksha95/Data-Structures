import java.util.*;
class PatternAmcat2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}