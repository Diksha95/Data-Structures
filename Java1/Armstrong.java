import java.util.*;
class Armstrong
{
	public static void main(String arr[])
	{
		int n,count=0;
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num=n;
		while(num>0)
		{
			int r=num%10;
			count=count+r*r*r;
			num=num/10;
		}
		if(count==n)
			System.out.println("Number is Armstrong");
		else 
			System.out.println("Number is not Armstrong");
		
	}

}