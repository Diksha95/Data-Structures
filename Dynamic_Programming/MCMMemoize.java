/* Memoize version of Matrix Chain Multiplication-Top Down Approach */
public class MCMMemoize {
    static int t[][]=new int[1001][1001];
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 3};
        System.out.println("The cost of multiplying the matrices are:"+solve(arr,1,arr.length-1));

    }

    public static int solve(int arr[],int i,int j)
    {
        for(int m=0;m<1001;m++)
        {
            for(int n=0;n<1001;n++)
            t[m][n]=-1;
            
        }
        int min=Integer.MAX_VALUE;
        if(i>=j)
        return 0;
        if(t[i][j]!=-1)
        return t[i][j];
        for(int k=i;k<=j-1;k++)
        {
            int temp=solve(arr, i, k)+solve(arr, k+1, j)+arr[i-1]*arr[k]*arr[j];
            if(temp<min)
            min=temp;
        }
        return t[i][j]=min;
    }
}