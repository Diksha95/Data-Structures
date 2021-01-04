import java.util.*;
class RecursiveInsert
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Insert(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void recur(int arr[],int n)
	{
		if(n==1)
			return;
		recur(arr,n-1);
		Insert(arr,n);
	}
	static void Insert(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
}
