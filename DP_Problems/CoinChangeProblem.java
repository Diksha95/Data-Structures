//This problem will help to find out the number of ways in which we can make the given sum where order of 
//coins does not matter
public class CoinChangeProblem {
    
    public static void main(String[] args) {
       int  sum = 10;
        int []S = {2, 5, 3, 6};
        int t[][]=new int [S.length+1][sum+1];
        System.out.println("The number of ways are : " +coinChange(S,sum,t));
    }

    static int coinChange(int arr[],int sum,int t[][])
    {
        for(int i=0;i<=arr.length;i++)
        {   
            for(int j=0;j<=sum;j++)
            {
                if(i==0)
                t[i][j]=0;  
                if(j==0)
                t[i][j]=1;
            }
        }
            for(int i=1;i<arr.length+1;i++)
            {
                for(int j=1;j<sum+1;j++)
                {

                    if(arr[i-1]<=j)
                    t[i][j]=(t[i][j-arr[i-1]] +t[i-1][j]);
                    else if(arr[i-1]>j)
                    t[i][j]=t[i-1][j];
                    else 
                        return 0;
                }
            }
            return t[arr.length][sum];
    }
}