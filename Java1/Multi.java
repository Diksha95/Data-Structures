import java.util.*;
class Multi
{
	public static void main(String arr[])
	{
		int n;
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+":"+n*i);
		}
	}
}