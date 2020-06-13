class KnapsackMemoization
{
    static int t[][]=new int[100][100];
    public static void main(String[] args) {
        int V[]={60,100,120};
        int Wt[]={10,20,30};
        int W=50;
        int n=V.length;
        for(int i=0;i<n+10;i++)
        {
            for(int j=0;j<W+10;j++)
            {
                t[i][j]=-1;
            }
        }
        System.out.println("The profit is : "+Knapsack(W, Wt, V, n));
    }

    static int max(int a,int b)
    {
        return (a>b?a:b);
    }

    static int Knapsack(int W, int Wt[], int V[], int n)
    {
        
        if(n==0 || W==0)
        return 0;
        if (t[n][W]!=-1)
        return t[n][W];
        else if (Wt[n-1]<=W)
        {t[n][W]=max(V[n-1]+Knapsack(W-Wt[n-1], Wt, V, n-1),Knapsack(W, Wt, V, n-1));
        return t[n][W]; }
        else 
       {
        t[n][W]=Knapsack(W, Wt, V, n-1);
        return t[n][W];
       } 
    }
}