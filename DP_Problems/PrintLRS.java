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
public class PrintLRS {
    
    public static void main(String args[]) {
      String a="AABEBCDD";
      int n=a.length();
      lengthLRS(a,a,n,n);
    }

    static void lengthLRS(String x,String y,int n,int m)
    {
        int t[][]=new int[n+1][m+1];
        char X[]=x.toCharArray();
        char Y[]=y.toCharArray();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<m;j++)
            t[i][j]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(X[i-1]==Y[j-1] && i!=j)
                t[i][j]=1+t[i-1][j-1];
                else
                t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        int a=t.length-1;
        int b=t[0].length-1;
        while(a > 0 && b > 0)
        {
            if(t[a][b]==1+t[a-1][b-1])
            { result.append(X[a-1]);
                a--;
                b--;
            }
            else
            {
                if(t[a][b]==t[a-1][b])
                a--;
                else
                b--;
            }
        }
            String LRS=result.reverse().toString();
            System.out.println("The required LRS is :"+ LRS);
    }
}