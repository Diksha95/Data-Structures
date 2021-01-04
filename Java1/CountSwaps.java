import java.util.Scanner;

class CountSwaps
{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int swaps=0;
        for(int i=1;i<n;i++)
        {
            
            for(int j=n-1;j>i;j--)
            {
                if(a[j]>a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swaps++;
                }
            }
        }
        for (int j=0;j<n;j++) 
		{
			System.out.print(a[j]+" ");
		}
		System.out.print("The no of swaps are"+swaps);
		sc.close();
	}
}