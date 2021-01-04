import java.util.*;
class Celsius
{
	public static void main(String arr[])
	{
	int c;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<=100;i++)
	{	
		System.out.println("Enter the number");
		c=sc.nextInt();
		float f=((c-32)*5)/9;
		System.out.println("tempreature in farenheit "+f);
	}

	}
}