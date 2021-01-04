import java.util.*;
import java.lang.Math;
class Quadratic
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int D;
		double x1,x2;
		D=b^2-4*a*c;
		if(D>0)
		{
			System.out.println("Real roots");
		}
		else if(D==0)
		{
			System.out.println("Equal roots");
		}
		else
		{
			System.out.println("Imaginary roots");
		}

		x1=(-b+Math.sqrt(D))/(2*a);
		x2=(-b-Math.sqrt(D))/(2*a);

		System.out.println("The roots are "+x1+"\t"+x2);
	}
}