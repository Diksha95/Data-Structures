import java.util.*;
class ReverseNo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		System.out.print("Reverse of the number is "+sum);
	}
}