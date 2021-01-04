import java.util.Scanner;
class Cielab
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int d=a-b;
	int output=d%10;
	if(output<9)
	{
		d=d+1;
	}
	else
	{
		d=d-1;
	}
	System.out.println(d);
}
}