import java.util.Scanner;
class Student
{
	public static void main(String arr[])
	{String[][] st=new String[10][10];
	System.out.println("Enter the values");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
		st[i][j]=sc.nextLine();
		}
		
	} 
		for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
		System.out.println(st[i][j]);
		}
		System.out.println();
	}
}
	}

