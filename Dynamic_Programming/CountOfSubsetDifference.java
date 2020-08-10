public class CountOfSubsetDifference {
    
    public static void main(String[] args) {
        int arr[]={1, 1, 2,3};
        int diff=1;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int S1=(diff+sum)/2;
        int t[][]=new int[arr.length+1][S1+1];
        System.out.println("The number of subsets are "+subsetPblm(arr, S1, t));
    }
    static int subsetPblm(int arr[],int sum,int t[][])
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
                    t[i][j]=(t[i-1][j-arr[i-1]] +t[i-1][j]);
                    else if(arr[i-1]>j)
                    t[i][j]=t[i-1][j];
                    else 
                        return 0;
                }
            }
            return t[arr.length][sum];
}
}