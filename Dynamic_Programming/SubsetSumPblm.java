/* Problem Statement - https://www.geeksforgeeks.org/subset-sum-problem-dp-25/ 
Time Complexity =O(sum*n) 
Space Complexity = O(sum*n) since we are using 2-d arrays*/
class SubsetSumPblm
{
    public static void main(String[] args) {
        int arr[]={3, 34, 4, 12, 5, 2};
        int sum=13;
        boolean t[][]=new boolean[arr.length+1][sum+1];
        System.out.println("The subset present or not :"+subsetPblm(arr,sum,t));
    }

    static boolean subsetPblm(int arr[],int sum,boolean t[][])
    {
        for(int i=0;i<=arr.length;i++)
        {   
            for(int j=0;j<=sum;j++)
            {
                if(i==0)
                t[i][j]=false;
                if(j==0)
                t[i][j]=true;
            }
        }
            for(int i=1;i<arr.length+1;i++)
            {
                for(int j=1;j<sum+1;j++)
                {

                    if(arr[i-1]<=j)
                    t[i][j]=(t[i-1][j-arr[i-1]] || t[i-1][j]);
                    else
                    t[i][j]=t[i-1][j];
                }
            }
            return t[arr.length][sum];
    }
}