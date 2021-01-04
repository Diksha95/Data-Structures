import java.util.*;
class FractionalKnapsack
{
	static void Fractional(int w[],int v[],int W,int n)
	{
		int x[]=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=0;
			int weight=0;
			while(weight< W)
			{
				if(weight+ w[i] <=W)
				{
					x[i]=1;
					weight=weight+w[i];
				}
				else
				{
					x[i]=(W-weight)/w[i];
					weight=W;
				}
			}
		}
		System.out.println("The solution of problem would be : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(x[i]+"\t");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of items");
		int n=sc.nextInt();
		System.out.println("Enter the weight of Knapsack");
		int W=sc.nextInt();
		int w[]=new int[n];
		int v[]=new int[n];
		float ratio[]=new float[n];
		System.out.println("Enter the weights of items");
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
		}
		System.out.println("Enter the values of items");
		for(int i=0;i<n;i++)
		{
			v[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			ratio[i]=(v[i]/w[i]);
		}
		Arrays.sort(ratio);
		sort(v,w,ratio,n);
		printFloat(ratio);
		System.out.println();
		printArray(v);
		System.out.println();
		printArray(w);
		Fractional(w,v,W,n);
	}
	static void sort(int v[],int w[],float ratio[],int n)
	{
		int temp=0,temp1=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(ratio[j]<ratio[j+1])
				{
					temp=w[j];
					w[j]=w[j+1];
					w[j+1]=temp;
					temp1=v[j];
					v[j]=v[j+1];
					v[j+1]=temp1;
				}
			}
		}
	}
	static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void printFloat(float arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}