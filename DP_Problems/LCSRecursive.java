public class LCSRecursive {
    
    public static void main(String[] args) {
        String x="AGGTAB";
        int n=x.length();
        String y="GXTXAYB";
        int m=y.length();
        System.out.println("The Length of LCS for x and y is : "+lengthLCS(x,y,n,m));
    }

    static int lengthLCS(String x,String y,int n,int m)
    {
        char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
        if (n==0 || m==0)
            return 0;
        else if(X[n-1] ==Y[m-1])
         return 1+lengthLCS(x, y, n-1, m-1);
        else 
            return Math.max(lengthLCS(x, y, n-1, m),lengthLCS(x, y, n, m-1));
    }
}