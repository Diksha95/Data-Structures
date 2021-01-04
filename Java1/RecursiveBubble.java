import java.util.*;
class RecursiveBubble
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubble(arr,n);
		System.out.println("Array Elements :");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void bubble(int arr[],int n)
	{
		if(n==1)
			return;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		bubble(arr,n-1);
	}
}