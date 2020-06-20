//Given a sequence, find the length of the longest palindromic subsequence in it.

public class LongestPalindromicSeq {
    
    static int t[][]=new int[101][101];
    public static void main(String[] args) {
        String a="agbcba";
        String b=reverse(a);
        int n=a.length();
        for(int i=0;i<101;i++)
        {
            for(int j=0;j<101;j++)
            {
                t[i][j]=-1;
            }
        }
        System.out.println("The length of palindromic string is "+lengthLCS(a,b,n,n));
    }
    static String reverse(String a)
    {
            StringBuilder sb=new StringBuilder(a);
            sb.reverse();
            return sb.toString();
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