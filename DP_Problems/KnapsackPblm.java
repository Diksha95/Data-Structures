class KnapsackPblm
{
    public static void main(String[] args) {
        int V[]={60,100,120};
        int Wt[]={10,20,30};
        int W=50;
        int n=V.length;
        Knapsack(W, Wt, V, n);
        //System.out.println("The profit is : "+Knapsack(W, Wt, V, n));

    }

    static int max(int a,int b)
    {
        return (a>b?a:b);
    }

    static void Knapsack(int W,int wt[],int v[],int n)
    {
        int X[][]=new int [n+1][W+1];

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=W;j++)
            {
                if(i==0 || j==0)
                X[i][j]=0;

                else if(wt[i-1]<=j)
                {
                    X[i][j]=max(v[i-1] + X[i-1] [j-wt[i-1] ], X[i-1][j]);
                }
                else
                X[i][j]=X[i-1][j];
            }
        }
        int res= X[n][W];
        int j=W;
        for(int i=n;i>0 && res>0;i--)
        {
            if(res==X[i-1][j]) //ith element is not included
                continue;
            else
                System.out.print(wt[i-1]+" ");
                W=W-wt[i-1];
                res=res-v[i-1];
        }

    }
}