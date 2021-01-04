import java.util.*;
class MCM
{
	static void Matrix(int p[],int n)
	{
		// p is dimension matrix
		// m is cost matrix
		// s is spilt matrix
		int m[][]=new int[n][n];
		int s[][]=new int [n][n];
		int q=0;
		for(int i=0;i<n;i++)
		{
			m[i][i]=0;
		}
		//l is chain length
		for(int l=2;l<n;l++)
		{
			for(int i=1;i<n-l+1;i++)
			{
				int j=i+l-1;
				m[i][j]=1000;
				for(int k=i;k<j-1;k++)
				{
					q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					if(q<m[i][j])
					{
						m[i][j]=q;
						s[i][j]=k;
						Print_Result(s,i,j);
					}
				}
			}
		}
		System.out.println("The no of scalar multiplication is "+q);
	}

	static void Print_Result(int s[][],int i,int j)
	{
		if(i==j)
		{
			System.out.print("A"+i);
		}
		else
		{
			System.out.print("(");
			Print_Result(s,i,s[i][j]);
			Print_Result(s,s[i][j]+1,j);
			System.out.print(")");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
				a[i]=sc.nextInt();
		}
		Matrix(a,n);
	}
}