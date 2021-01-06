public class MinSubsetSumDifference {
    
    public static void main(String[] args) {
        int arr[]={1, 6, 11,5};
        int range=0;
        int n=arr.length;
         for(int i=0;i<n;i++)
        {
            range=range+arr[i];
        }
        boolean t[][]=new boolean [n+1][range+1]; 
        subsetPblm(arr,range,t);
    }
    static void subsetPblm(int arr[],int range,boolean t[][])
    {
        int n=arr.length;
        for(int i=0;i<=n;i++)
        {   
            for(int j=0;j<=range;j++)
            {
                if(i==0)
                t[i][j]=false;
                if(j==0)
                t[i][j]=true;
            }
        }
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=range;j++)
                {

                    if(arr[i-1]<=j)
                    t[i][j]=(t[i-1][j-arr[i-1]] || t[i-1][j]);
                    else
                    t[i][j]=t[i-1][j];
                }
            }
            int min=Integer.MAX_VALUE;
            //It will find out the largest value of j which will give minimum difference
           int min=Integer.MAX_VALUE;
            for(int k=0;k<range/2;k++){
				
				if( t[arr.length][k]==true)
				{
					min=Math.min(min,range - 2 * k );
				}
			}
            System.out.println(min);
    }
}