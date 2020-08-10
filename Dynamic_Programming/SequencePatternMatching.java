/* Given two strings a and b and we have check whether b contains string a or not.*/
public class SequencePatternMatching {
    public static void main(String[] args) {
        String a="AXY";
        String b="ADXCPY";
        System.out.println("String b contains String a ? "+findPattern(a,b,a.length(),b.length()));
    }

    static boolean findPattern(String x,String y,int n,int m)
    {
        int t[][]=new int[n+1][m+1];
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

        int a=n;
        int b=m;
        StringBuilder sb=new StringBuilder();
        while(a>0 && b>0)
        {
            if(X[a-1]==Y[b-1])
            {
                sb.append(X[a-1]);
                a--;
                b--;
            }
            else if(t[a-1][b]>t[a][b-1])
                a--;
            else 
                b--;
        }
        String LCS=sb.reverse().toString();
        if(LCS.equalsIgnoreCase(x))
        return true;
        else
        return false;
    }
}