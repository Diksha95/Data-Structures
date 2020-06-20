//You are given coins of different denominations and a total amount of money amount. 
//Write a function to compute the fewest number of coins that you need to make up that amount. 
//If that amount of money cannot be made up by any combination of the coins, return -1.
public class CoinChangeSecond {

    public static void main(String[] args) {
       int[] coins = {1, 2, 5};
       int amount = 11;
       int t[][]=new int[coins.length+1][amount+1];
        System.out.println("The minimum number of coins needed are : "+minCoins(coins, amount, t));
    }
    static int minCoins(int arr[],int sum,int t[][])
    {
        int n=arr.length;
        int infinite=Integer.MAX_VALUE-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<sum;j++)
            {
                if(i==0) //Infinite coins can be considered to be make sum  
                t[i][j]=infinite;
                if(j==0)
                t[i][j]=0;
            }
        }
        for(int j=0;j<sum+1;j++)
        {
            if(j%arr[0]==0)   //if 1 coin is there to make sum 3 we need 3 coins
            {
                t[1][j]=(int)j/(arr[0]);
            }
        }
        for(int i=2;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
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