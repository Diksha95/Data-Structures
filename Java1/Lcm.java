import java.util.*;
class Lcm
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int max,i,lcm;
		max=(num1>num2)?num1:num2;
		i=max;
		while(true)
		{
			if(i%num1==0 && i%num2==0)
			{
				lcm=i;
				break;
			}
			i+=max;
		}
		System.out.println("The lcm of "+num1+" and "+num2+" is "+lcm);
	}
}