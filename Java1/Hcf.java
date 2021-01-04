import java.util.*;
class Hcf
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int min,hcf=1;
		min=(num1<num2)?num1:num2;
		for(int i=1;i<=min;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("The hcf of "+num1+" and "+num2+" is "+hcf);
	}
}