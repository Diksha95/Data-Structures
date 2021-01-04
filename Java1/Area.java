import java.util.*;
class Area
{
	static float pi=(float)3.14;
	public static void main(String arr[])
	{
		System.out.println("Enter the values of radius and height");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int h=sc.nextInt();
		Area a=new Area();
		a.areaOfCircle(r);
		a.areaOfCylinder(r,h);

	}
	void areaOfCircle(int r)
	{
		float area=2*pi*r;
		System.out.println("areaOfCircle is "+ area);
	}
	void areaOfCylinder(int r,int h)
	{
		float area=pi* r*r*h;
		System.out.println("areaOfCylinder is "+ area);
	}
}