public class EqualSumPartition {
    public static void main(String[] args) {
        int arr[]={1,4,5,7};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        boolean t[][]=new boolean[arr.length+1][sum+1];
        if(sum%2!=0)
        System.out.println("The equal parition is possible or not : "+false);
        else if(sum%2==0)
        System.out.println("The equal parition is possible or not : "+subsetPblm(arr,sum/2,t));
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