/* Minimum number of deletions and insertions to transform one string into another.Given two strings ‘str1’ and 
‘str2’ of size m and n respectively. The task is to remove/delete and insert minimum number of characters from
/in str1 so as to transform it into str2. It could be possible that the same character needs to be removed/
deleted from one point of str1 and inserted to some another point. 
https://leetcode.com/problems/delete-operation-for-two-strings/submissions/
*/

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
		
		static int LCSBottomUp(String X,String Y,int n,int m){
        int t[][]=new int[n+1][m+1];
		
		char[] x=X.toCharArray();
		char[] y=Y.toCharArray();
		
		
		for(int i=0;i<n+1;i++)
			for(int j=0;j<m+1;j++)
				t[i][j]=0;
				
				
		for(int i=1;i<n+1;i++){
			for(int j=1;j<m+1;j++){
				
				if(x[i-1]==y[j-1])
				{
					t[i][j]= 1 +t[i-1][j-1];
				}
				else
					t[i][j]= Math.max(t[i][j-1],t[i-1][j]);
			}
        }	
			return t[n][m];
    }
}