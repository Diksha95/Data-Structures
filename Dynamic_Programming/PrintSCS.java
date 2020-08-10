public class PrintSCS {

    public static void main(String[] args) {
        String x="acbcf";
        int n=x.length();
        String y="abcdaf";
        int m=y.length();   
        printSCS(x, y, n, m);
      
    }

    static void printSCS(String x,String y,int n,int m)
    {   
        int t[][]=new int[n+1][m+1];
        char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
        int lengthSCS=0;
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

        if(n==0 || m==0)
            lengthSCS=0;
        else 
            lengthSCS=(n+m)-t[n][m];

        System.out.println("The length of expected scs is :"+lengthSCS);

            int a=t.length-1;
            int b=t[0].length-1;
            StringBuilder result = new StringBuilder();
            while(a > 0 && b > 0)
            {
                if(X[a-1]==Y[b-1])
                {
                    result.append(X[a-1]);
                    a--;
                    b--;
                }
                
                else
                {
                    if(t[a-1][b]>t[a][b-1])
                    {
                        result.append(X[a-1]);
                        a--;
                    }
                    else
                    {
                        result.append(Y[b-1]);
                        b--;
                    }
                }               
            }
            String scs=result.reverse().toString();
            System.out.println("The exepcted SCS is :"+scs);
    }
}