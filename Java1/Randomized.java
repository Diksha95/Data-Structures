import java.util.*;
class Randomized
{
	static int RandomPartition(int arr[],int p,int r)
	{
		Scanner sc=new Scanner(System.in);
		int i,temp;
		Random rn=new Random();
		i=p+rn.nextInt((r-p)+1);
		temp=arr[i];
		arr[i]=arr[r];
		arr[r]=temp;
		return Partition(arr,p,r);
	}
	static int Partition(int arr[],int p,int r)
	{
		//x is the pivot element
		int x=arr[r];
		int i=p-1;
		for(int j=p;j<=r-1;j++)
		{
			if(arr[j]<=x)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp1=arr[i+1];
		arr[i+1]=arr[r];
		arr[r]=temp1;

		return i+1;
	}
	static void QuickSort(int arr[],int p,int r)
	{
		if(p<r)
		{
			int q=RandomPartition(arr,p,r);
			QuickSort(arr,p,q-1);
			QuickSort(arr,q+1,r);
		}
	}
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		QuickSort(arr,0,n-1);
		printArray(arr);
	}
}