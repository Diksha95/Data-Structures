class RodCutting
{
    public static void main(String[] args) {
        int L[]={1,2,3,4,5,6,7,8};
        int P[]={3,5,8,9,10,17,17,20};
        int n=L.length;
        int t[][]=new int[n+1][n+1];
        System.out.println("The maximum profit in case of Rod Cutting Knapsack would be : "+rodCutting(L, P, n,t));
    }

    static int rodCutting(int l[],int p[],int n,int t[][])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                t[i][j]=0;
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(l[i-1]<=j)
                    t[i][j]=max(p[i-1]+t[i][j-l[i-1]],t[i-1][j]);
                else
                    t[i][j]=t[i-1][j];
            }
        }
            return t[n][n];
    }

    static int max(int a,int b)
    {
        return a>b?a:b;
    }
}