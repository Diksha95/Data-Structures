class PrintLCS {
    public static void main(String[] args) {
        String x="ABCDGH";
        int n=x.length();
        String y="AEDFHR";
        int m=y.length();
        int t[][]=new int[n+1][m+1];
        System.out.println("The Length of LCS for x and y is : "+lengthLCS(x,y,n,m,t));
    }

    static String lengthLCS(String x,String y,int n,int m,int t[][])
    {   
        char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
        String lcs="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                t[i][j]=0;
            }
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(X[i-1]==Y[j-1])
                t[i][j]=1+t[i-1][j-1];
                else
                t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        int a=n;
        int b=m;
        while(a>0 && b>0)
        {
            if(X[a-1]==Y[b-1])
            {
                lcs=lcs+X[a-1];
                a--;
                b--;
            }
            else if(t[a-1][b]>t[a][b-1])
                a--;
            else 
                b--;
        }
        String reverseLCS=reverse(lcs);
        return reverseLCS;
    }
    
    static String reverse(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}