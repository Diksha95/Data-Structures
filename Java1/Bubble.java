import java.util.*;
class Bubble
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		//for(int test=0;test<t;test++)
		//{
			System.out.print("Enter no of elements : ");
			int n=sc.nextInt();
			System.out.println("Enter array elements : ");
			int arr[]=new int[n];
			for(int e=0;e<n;e++)
			{
				arr[e]=sc.nextInt();
			}
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
		System.out.print("Array elements are : ");
			for(int k=0;k<n;k++)
			{
				System.out.print(arr[k]+" ");
			}	

	}
}