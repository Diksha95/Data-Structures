/**
 * 
 * Problem Statement-
 * [New Year Chaos](https://www.hackerrank.com/challenges/new-year-chaos/problem) 
 */

public class NewYearChaos {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,6,4};
        int n=arr.length;
        int swapCount=0;
        for(int i=n-1;i>=0;i--)
        {
                if(arr[i]!=(i + 1))
                {
                    if(arr[i - 1] == (i + 1) && (i - 1) >=0){
                        swapCount++;
                        swap(arr,i-1,i);
                    }
                    else if(arr[i - 2] == (i + 1) && (i - 2) >=0){
                        swapCount=swapCount+2;
                        swap(arr,i-2,i-1);
                        swap(arr,i-1,i);
                    }
                    else{
                        System.out.println("Too chaotic");
                        return;
                    }
                    
                }
        }
        System.out.println(swapCount);
    }

    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}