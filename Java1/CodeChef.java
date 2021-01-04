import java.util.Scanner;
class CodeChef
{
	public static void main(String arr[])
	{
			Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
				for(int i=0;i<t;i++)
				{
					int n=sc.nextInt();
					int s[]=new int[n];

					for(int j=0;j<n;j++)

						s[j]=sc.nextInt();

						int min=s[0]-s[1];

					for(int k=2;k<n-2;k++)
					{
						int x=s[k]-s[k+1];
						if(x<min)
							min=x;
			}
			System.out.println(min);
	}

}