/* 
	https://leetcode.com/problems/integer-break/
				Sum  		Product
	dp[6]      5+1			5*1   =  5
			   4+2          4*2   =  8
			   3+3          3*3   =  9
			  ***** 	   *****			Numbers starts to repeat from here therefore we can iterate loop till i/2
			   2+4			2*4   =  8
			   1+5          1*5   =  5
			   
				Sum         Product
	  (i)	 		      (i-j)*j
	dp[8]      7+1			1*7   =  5
			   6+2          2*6   =  12
			   5+3          3*5   =  15
			   4+4          4*4   =  16
			  ***** 
			   5+3
			   6+2
			   7+1
			   
	If we look for 2*6 for dp[8] it can be written as 2*(3*3) here 3*3 we already calculated for dp[6] as 9
	so 2*9=18
	so maximum product for dp[8] we got 18;
	dp[8]=2*dp[6]  dp[i]=j*dp[i-j]
*/

class IntegerBreak{
	
	
	public static void main(String args[]){
		
		int N=10;
		int dp[]=new int[N+1]; //Only single array is needed because only one attribute is changing
		System.out.println("The maximum product you can get is :"+maxProduct(N,dp));
	}
	
	public static int maxProduct(int n,int dp[]){
		
		dp[0]=1;
		dp[1]=1;

			for(int i=2;i<=n;i++){
				
				for(int j=1;j<=i/2;j++){    
					
					int a=(i-j)* j;
					int b=(dp[i-j]*j);
					dp[i]=Math.max(dp[i],Math.max(b,a));	
				}
			}
		return dp[n];
		
	}
}