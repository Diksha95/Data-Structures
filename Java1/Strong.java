import java.util.*;
class Strong
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);				/*Strong number is 145=1!+2!+5!*/
		int n=sc.nextInt();
		int x=n; int count=0;
		while(x>0)
		{
			int r=x%10;
			count=count+fact(r);
			x=x/10;
		}
		if(count==n)
			System.out.println("Number is strong");
		else 
			System.out.println("Number is not strong");
		
	}
	static int fact(int num)
	{
		if(num==1|| num==0)
			return 1;
		else
			return num*fact(num-1);
	}
}