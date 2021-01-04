import java.util.*;
import logicgate.Not;
import logicgate.And;
import logicgate.Or;
class Imp
{
	public static void main(String arr[])
	{
		System.out.println("Enter the two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Not n=new Not();
		And an=new And();
		Or or=new Or();
		n.doOperation(a);
		an.doOperation(a,b);
		or.doOperation(a,b);

	}
}