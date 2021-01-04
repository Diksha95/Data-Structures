import java.util.*;
class Greater
{
	public static void main(String arr[])
	{
		int a,b;
		System.out.println("Enter the values of a and b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		
			System.out.println("Greater is a");
		else
			System.out.println("Greter is b");
	}

}