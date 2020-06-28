/* Minimum number of deletions to make a string palindrome.Given a string of size ‘n’.The task is to remove or 
delete minimum number of characters from the string so that the resultant string is palindrome. */
public class MinDeleteForPalindrome {
    
    public static void main(String[] args) {
        String s="agbcba";
        int n=s.length();
        int t[][]=new int[n+1][n+1];
        System.out.println("The minimum no of deletions required are :"+(n-lengthLCS(s,reverse(s),n,n,t)));
    }

    static int lengthLCS(String x,String y,int n,int m,int t[][])
    {
            char []X=x.toCharArray();
            char []Y=y.toCharArray();
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
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
            return t[n][m];
    }
    static String reverse(String a)
    {
        StringBuilder sb=new StringBuilder(a);
        sb.reverse();
        return sb.toString();
    }
}