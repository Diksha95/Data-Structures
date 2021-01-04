package logicgate;
public class And
{
	public int doOperation(int a,int b)
	{
		int c=a|b;
		System.out.println("the And operation is "+c);
		return 0;
	}
}