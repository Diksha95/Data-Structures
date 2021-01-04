import java.util.*;
class Wipro
{
	static int[] array(int arr[],int k)
	{
		int temp=0;int temp1=0;
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=k+1;i<arr.length;i++)
		{
			for(int j=k+1;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp1=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp1;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ar[]=new int[10];
		ar=array(arr,k);
		System.out.println("The sorted array is ");
		for(int i=0;i<10;i++)
		{
			System.out.print(ar[i]+"\t");
		}
	}
}