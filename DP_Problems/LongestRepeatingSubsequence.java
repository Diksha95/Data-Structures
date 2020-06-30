/* Given a string, print the longest repeating subsequence such that the two subsequence don’t have same string
character at same position, i.e., any i’th character in the two subsequences shouldn’t have the same index in 
the original string.
Example:
Input: str = "aab"
Output: "a"
The two subsequence are 'a'(first) and 'a' 
(second). Note that 'b' cannot be considered 
as part of subsequence as it would be at same
index in both. */
public class LongestRepeatingSubsequence
{
    static int t[][]=new int[101][101];
    public static void main(String args[]) {
      String a="AABEBCDD";
      int n=a.length();
     for(int i=0;i<101;i++)
     {
         for(int j=0;j<101;j++)
         {
             t[i][j]=-1;
         }
     }
     System.out.println("The length of longest repeating subsequence is :"+lengthLRS(a,a,n,n));
    }

    static int lengthLRS(String x,String y,int n,int m)
    {
        char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
        if(n==0 || m==0)
        return 0;
        else if(t[n][m]!=-1)
        return t[n][m];
        else if(X[n-1]==Y[m-1] && n!=m)
        return t[n][m]=1+lengthLRS(x, y, n-1, m-1);
        else
        return t[n][m]=Math.max(lengthLRS(x, y, n-1, m),lengthLRS(x, y, n, m-1));     
    }
}