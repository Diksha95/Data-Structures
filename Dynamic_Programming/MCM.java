/*Given a sequence of matrices, find the most efficient way to multiply these matrices together. 
The problem is not actually to perform the multiplications, but merely to decide in which order to 
perform the multiplications. */
public class MCM {
    
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 3};
        System.out.println("The cost of multiplying the matrices are:"+solve(arr,1,arr.length-1));
    }

    public static int solve(int arr[],int i,int j)
    {
        int min=Integer.MAX_VALUE;
        if(i>=j)
        return 0;
        for(int k=i;k<=j-1;k++)
        {
            int temp=solve(arr, i, k)+solve(arr, k+1, j)+arr[i-1]*arr[k]*arr[j];
            if(temp<min)
            min=temp;
        }
        return min;
    }
}