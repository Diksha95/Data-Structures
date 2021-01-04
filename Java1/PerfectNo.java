import java.util.*;
class PerfectNo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("Number is perfect no");
		}
		else
		{
			System.out.println("Number is not perfect no");
		}
	}
}