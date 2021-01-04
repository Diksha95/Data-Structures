import java.util.*;
class Heap
{
	static void Heapify(int arr[],int n,int i)
	{
		// n is the heap size
		int l=2*i;
		int r=2*i+1;
		int largest;
		if(l<n && arr[l]>arr[i])
			largest=l;
		else
			largest=i;
		if(r<n && arr[r]>arr[largest])
			largest=r;
		if(largest!=i)
		{
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			Heapify(arr,n,largest);
		}
		
	}
	static void BuildHeap(int arr[])
	{
		int n=arr.length;
		for(int i=n/2;i>=0;i--)
		{
			Heapify(arr,n,i);
		}
	}
	static void HeapSort(int arr[])
	{
		BuildHeap(arr);
		for(int i=arr.length-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			Heapify(arr,i,0);
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
		HeapSort(arr);
		printArray(arr);
	}
}