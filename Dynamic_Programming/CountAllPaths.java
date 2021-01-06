/* https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right/0 */
import java.util.*;
public class CountAllPaths {

    	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	    for(int k=0;k<T;k++)
	    {   
	        int n=sc.nextInt();
            int m=sc.nextInt();
            sc.close();
            int t[][]=new int[n][m];
            System.out.println("The possible paths are : "+possiblePaths(n,m,t));
        }
        
	}
	
	static int possiblePaths(int n,int m,int t[][])
	{   
            for(int i=0;i<n;i++)
            {
                t[i][0]=1;
                for(int j=0;j<m;j++)
                {
                   t[0][j]=1;
                        
                }
            }
          
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=m;j++)
                {
                    t[i][j]=t[j-1][i]+t[i-1][j];
                }
            }
	    return t[n-1][m-1];
}
}