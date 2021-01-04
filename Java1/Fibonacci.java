//Fibonacci series upto certain number like 5- 0 1 1 2 3 5
import java.util.*;
class Fibonacci
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1;
		System.out.print(a+" \t");
		System.out.print(b+"\t");
		int nextTerm=a+b;
		while(nextTerm<=n)
		{
			System.out.print(nextTerm+"\t");
			a=b;
			b=nextTerm;
			nextTerm=a+b;
		}
	}
}