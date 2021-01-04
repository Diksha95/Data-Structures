import java.util.*;
class A
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns of array");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}

			System.out.println();

		}

		Set<Integer> value=new HashSet<>();

		int rowmin[]=new int[m];
		int rowmax[]=new int[m];
		int colmin[]=new int[n];
		int colmax[]=new int[n];

		for(int i=0;i<m;i++)
		{
			int rowMin=Integer.MIN_VALUE;
			int rowMax=Integer.MAX_VALUE;
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]<rowMin)
					rowMin=arr[i][j];
				if(arr[i][j]>rowMax)
					rowMax=arr[i][j];
			}
			value.add(rowMin);
			value.add(rowMax);
		}

		for(int j=0;j<n;j++)
		{
			int colMin=Integer.MIN_VALUE;
			int colMax=Integer.MAX_VALUE;
			for(int i=0;i<m;i++)
			{
				if(arr[j][i]<colMin)
					colMin=arr[j][i];
				if(arr[j][i]>colMax)
					colMax=arr[j][i];
					
			}
			value.add(colMin);
			value.add(colMax);
		}
		System.out.println("Number of positional elements are" +value.size());
	}
}