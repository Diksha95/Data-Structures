import java.util.*;
class Triplet
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the triplet number");
		int n=sc.nextInt();
		int m=1;
		int count=0;
		int flag=0;
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		find(arr,5,n);
	}
	public static void sort(int arr[],int n)
	{		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
					{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
		public static void find(int arr[],int num,int n)
		{
			sort(arr,num);
			for(int i=0;i<num-2;i++)
		{
			for(int j=i+1;j<num-1;j++)
			{
				for(int k=j+1;k<num;k++)
				{
					if(arr[i]+arr[j]+arr[k]==n)
						{
							System.out.println("The triplets are:"+arr[i]+" "+arr[j]+" "+arr[k]);
						}
				}
			}
				
			}
		}
}