import java.util.*;
class Factorial
{
	public static void main(String arr[])
	{
		int n,fact=1;
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is"+fact);
	}

}