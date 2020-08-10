//This is the tabular solution of longest common subsequence problem (Length of LCS)
public class LongestCommonSubsequence {
        
        public static void main(String[] args) {
        String x="AGGTAB";
        int n=x.length();
        String y="GXTXAYB";
        int m=y.length();
        int t[][]=new int[n+1][m+1];
        System.out.println("The Length of LCS for x and y is : "+lengthLCS(x,y,n,m,t));

    }

    static int lengthLCS(String x,String y,int n,int m,int t[][])
    {   
        char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
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
        return t[n][m];
    }
}