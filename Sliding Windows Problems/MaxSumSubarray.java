/* https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1 */
import java.util.*;
class MaxSumSubarray{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){

            int N=sc.nextInt();
            int K=sc.nextInt();
            int arr[]=new int[N];
            for(int k=0;k<N;k++){
                arr[k]=sc.nextInt();
            }

            System.out.println("The max sum of subarray is "+findMaxSum(arr,N,K));
        }
        sc.close();

    }
    public static int findMaxSum(int arr[],int N,int K){

        int i=0,j=0,sum=0;
        int max=Integer.MIN_VALUE;
        while(j<N){

            sum+=arr[j];
            if(j-i+1 < K)  //Check whether our window has reached the required size or not
                j++;
            else if(j-i+1==K){
                max=Math.max(max, sum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}