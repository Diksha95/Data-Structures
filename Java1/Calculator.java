class Calculator
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int b)
	{
		System.out.println(a/b);
	}
}
class ScientificCalculator extends Calculator
{
	public static void square(int a)
	{
		System.out.println(a*a);
	}
	public static void main(String arr[])
	{
		ScientificCalculator sc=new ScientificCalculator();
		sc.add(2,3);
		sc.sub(5,3);
		sc.mul(2,3);
		sc.div(4,2);
		square(5);
	}
}