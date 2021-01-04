import java.util.*;
class Palindrome
{
	public static void main(String arr[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of number");
		int min=sc.nextInt();
		int max=sc.nextInt();
		/*System.out.println("Enter a number");
		num=sc.nextInt();*/
		for(int i=min;i<=max;i++)
		{
			if(Palin(i)==true)
			{
				System.out.print(i+"\t");
			}
		}
	}
	static boolean Palin(int num)
	{	int sum=0,rem,n=0;
		n=num;
		while(n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(sum==num)
		return true;
			/*System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");*/
		else
		return false;
	}
}