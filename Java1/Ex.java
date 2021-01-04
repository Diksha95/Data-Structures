class Ex
{
	
	void show(int a)
	{
	System.out.println("show"+a);
	} }

class B extends Ex
{		
	
	public void show(double b){
		
		System.out.println("demo"+b);
		
	}

	
	public static void main(String... abc)
	{
		B b=new B();
		b.show(5);
		Ex e=new B();
		e.show(6);
	}
}