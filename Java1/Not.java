package logicgate;
public class Not
{
	public int doOperation(int a)
	{
		int b=~a;
		System.out.println("Not Operation is"+b);
		return 0;
	}
}