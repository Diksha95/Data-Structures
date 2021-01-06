//https://www.techiedelight.com/find-total-ways-reach-nth-stair-with-atmost-m-steps/

class NoOfWaysToNthStair{
	
	
	public static void main(String args[]){
		
		int k=2;
		int n=3;
		
		System.out.println("The required value is :"+minCoinBottomUp(n,k));
	}
	
	static int minCoinBottomUp(int n, int k){
		int dp[]=new int[n+1];
		
		int maxWays=0;
		
		if(n==0)
			return 1;  //because our ultimate goal is to reach 0th stair from nth stair or vice-versa using kth step 
						//if we reached there then we will count that way as 1
		if(n<0)
			return 0;
			
		else if(dp[n]==0){
			
			for(int i=1;i<=k;i++){
				
				maxWays+=minCoinBottomUp(n-i,k);
			}
			
		}
			return dp[n]=maxWays;
    }
}