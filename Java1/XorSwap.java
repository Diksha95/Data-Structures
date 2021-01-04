import java.util.*; 
class XorSwap
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("The values of x :"+ x +" and y :"+y);
		x=xor(x,y);
		y=xor(x,y);
		x=xor(x,y);
		System.out.println("The values of x :"+ x +" and y :"+y);

	}
	static int xor(int x,int y)
	{
		return x^y;
	}
}