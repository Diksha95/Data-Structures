/* Minimum number of deletions and insertions to transform one string into another.Given two strings ‘str1’ and 
‘str2’ of size m and n respectively. The task is to remove/delete and insert minimum number of characters from
/in str1 so as to transform it into str2. It could be possible that the same character needs to be removed/
deleted from one point of str1 and inserted to some another point. */
public class MinimumInsertionDeletion {
       static int t[][]=new int[101][101];
        public static void main(String[] args) {
            String a="HEAP";
            String b="PEA";
            int n=a.length();
            int m=b.length();
            for(int i=0;i<101;i++)
            {
                for(int j=0;j<101;j++)
                {
                    t[i][j]=-1;
                }
            }
            System.out.println("Minimum No of Deletions: "+(n-LCS(a,b,n,m)));
            System.out.println("Minimum No of Insertions :" +(m-LCS(a,b,n,m)));
        }

        static int LCS(String a,String b,int n,int m)
        {
            char []ch1=a.toCharArray();
            char []ch2=b.toCharArray();
            if(n==0 || m==0)
            return 0;
            if(t[n][m]!=-1)
            return t[n][m];
            else if(ch1[n-1]==ch2[m-1])
            return t[n][m]=1+LCS(a,b,n-1,m-1);
            else
            return t[n][m]=Math.max(LCS(a,b,n-1,m),LCS(a,b,n,m-1));
        }
}