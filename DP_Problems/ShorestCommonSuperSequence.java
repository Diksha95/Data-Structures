class ShorestCommonSuperSequence
{
    static int t[][]=new int[1001][1001];
    public static void main(String[] args) {
        String x="AGGTAB";
        int n=x.length();
        String y="GXTXAYB";
        int m=y.length();
        for(int i=0;i<1001;i++)
        {
            for(int j=0;j<1001;j++)
            {
                    t[i][j]=-1;
            }
        }
        System.out.println("The shorest common subsequnce length is :"+subsequence(x,y,n,m));
    }

    static int subsequence(String x,String y,int n,int m)
    {
        if(n==0 || m==0)
            return 0;
        else 
            return (n+m)-lengthLCS(x,y,n,m);
    }

    static int lengthLCS(String x,String y,int n,int m)
    {   
        
        char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
        if (n==0 || m==0)
            return 0;
        if(t[n][m]!=-1)
        return t[n][m];

        else if(X[n-1] ==Y[m-1])
         return t[n][m]=1+lengthLCS(x, y, n-1, m-1);
        else 
            return t[n][m]=Math.max(lengthLCS(x, y, n-1, m),lengthLCS(x, y, n, m-1));
    }
    
}