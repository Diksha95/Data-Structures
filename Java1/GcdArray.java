import java.util.Scanner;
class GcdArray
{
	public static int gcd(int a,int b)
	{
		if(a==0)
			return b;
		else
			return gcd(b % a,b);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array range");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{arr[i]=sc.nextInt();}
		
		int result=arr[0];
		for(int i=1;i<n;i++)
		{
			result=gcd(arr[i],result);
		}
		System.out.println("The gcd of numbers are:"+result);
	}
}