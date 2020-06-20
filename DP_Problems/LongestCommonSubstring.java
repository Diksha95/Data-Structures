class LongestCommonSubstring {
	public static void main (String[] args) {

            String X="ABCDGH";
            int n=X.length();
            String Y="ACDGHR";
            int m=Y.length();
		    int t[][]=new int[n+1][m+1];
		    System.out.println(LCString(X,Y,n,m,t));
		
	}
	
	static int LCString(String x,String y,int m,int n,int t[][])
	{
	    char X[]=x.toCharArray();
	    char Y[]=y.toCharArray();
	    int max=0;
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
                {
                    t[i][j]=1+t[i-1][j-1];
                    max=Math.max(t[i][j], max);
                }
	           else
	           t[i][j]=0;
	        }
	    }
	    return max;
	}
}