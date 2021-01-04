import java.util.*;
class Swap
{
	public static void main(String arr[])
	{
	System.out.println("Enter the values of a and b");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Values before Swapping");
	System.out.println(a);
	System.out.println(b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Values after Swapping");
	System.out.println(a);
	System.out.println(b);
	}
}