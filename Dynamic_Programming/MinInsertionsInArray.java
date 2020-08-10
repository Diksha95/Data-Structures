/*Given an array of integer numbers, we need to sort this array in a minimum number of steps where in one step
 we can insert any array element from its position to any other position. */
import java.util.*;
class MinInsertionsInArray {
   static int t[][]=new int[1001][1001];

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int q=0;q<T;q++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int k=0;k<n;k++)
		    {
		        a[k]=sc.nextInt();
			}
			for(int i=0;i<1001;i++)
            {
                for(int j=0;j<1001;j++)
                {
                    t[i][j]=-1;
                }
			}
			//Copying array by value which ensures that changes made in original array will not reflect in 
			//the copied array.
			int[] b = new int[n];
			System.arraycopy(a, 0, b, 0,n);
			Arrays.sort(a);
		    System.out.println("The no of insertions required are :"+(n-lengthLCS(b,a,n,n)));
        }
        sc.close();
	}
	
	 static int lengthLCS(int[] X,int [] Y,int n,int m)
    {   
		if (n==0 || m==0)
        return 0;
        if(t[n][m]!=-1)
        return t[n][m];
        else if(X[n-1] ==Y[m-1])
         return t[n][m]=1+lengthLCS(X, Y, n-1, m-1);
        else 
            return t[n][m]=Math.max(lengthLCS(X, Y, n-1, m),lengthLCS(X, Y, n, m-1));
    }
}