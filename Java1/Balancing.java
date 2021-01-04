import java.util.Scanner;
class Balancing
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{	int nge=-1;
			for(int j=i+1;j<10;j++)
			{
				if(a[i]<a[j])
				{
					nge=a[j];
					break;
				}
				
			}
			System.out.println("array"+" nge");
			System.out.println(a[i]+"   "+nge);
		}
	}
}