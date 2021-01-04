import java.util.*;
class SelectionSort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int test=0;test<t;test++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int e=0;e<n;e++)
			{
				arr[e]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int min=i;
				for(int j=i+1;j<n;j++)
				{
					if(arr[j]<arr[min])
					{
						min=j;
					}
				}
				if(min!=i)
				{
					int temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
				}
			}
			System.out.println("Array elements are: ");
			for(int k=0;k<n;k++)
			{
				System.out.print(arr[k]+"\t");
			}

		}
	}
}