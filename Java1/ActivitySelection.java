import java.util.*;
class ActivitySelection
{
	static void Activity(int s[],int f[])
	{
		int n=s.length;
		int i=0;
		System.out.print("The activities which can be scheduled are :");
		System.out.print((i+1)+"\t");
		for(int m=2;m<n;m++)
		{
			if(s[m]>=f[i])
			{
				System.out.print((m+1)+"\t");
				i=m;
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of activities");
		int n=sc.nextInt();
		int s[]=new int[n];
		int f[]=new int[n];
		System.out.println("Enter the start time of activities");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		System.out.println("Enter the finish time of activities");
		for(int i=0;i<n;i++)
		{
			f[i]=sc.nextInt();
		}
		Arrays.sort(f);
		/*for(int i=0;i<n;i++)
		{
			System.out.print(f[i]+" ");
		}*/
		Activity(s,f);
	}
}