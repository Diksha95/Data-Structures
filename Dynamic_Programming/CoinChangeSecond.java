//You are given coins of different denominations and a total amount of money amount. 
//Write a function to compute the fewest number of coins that you need to make up that amount. 
//If that amount of money cannot be made up by any combination of the coins, return -1.
public class CoinChangeSecond {

    public static void main(String[] args) {
       int[] coins = {2,5,10,1};
       int amount = 27;
      
	   
	   int x=minCoins(coins, amount);
		if(x==Integer.MAX_VALUE-1)
		System.out.println("The minimum number of coins needed are : -1");
		else
        System.out.println("The minimum number of coins needed are : "+x);
    }
	
    static int minCoins(int arr[],int sum)
    {
		
        int n=arr.length;
        int infinite=Integer.MAX_VALUE-1;
		int t[][]=new int[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {		t[i][0]=0;
           
        }
		for(int j=0;j<=sum;j++){
                 //Infinite coins can be considered to be make sum  
                t[0][j]=infinite;
        }
			
        for(int i=1;i<=n;i++){
			
            for(int j=1;j<=sum;j++){
				
                if(arr[i-1]<=j)
				
                t[i][j]=min(1+t[i][j-arr[i-1]],t[i-1][j]); //including coin thats why we have taken 1
				
                else
                t[i][j]=t[i-1][j];
            }
        }
        return t[n][sum];
    }

    static int min(int a,int b)
    {
        return a<b?a:b;
    }
}