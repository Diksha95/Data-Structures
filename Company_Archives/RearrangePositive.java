import java.util.Arrays;

/* Given an array of positive and negative numbers, arrange them such that all negative integers appear
before all the positive integers in the array without using any additional data structure like hash 
table, arrays, etc. The order of appearance should be maintained. */
class RearrangePositive
{
    public static void main(String[] args) {
        int arr[]={ 12,11,-13,-5,6,-7,5,-3,-6};
        rearrange(arr, 0, arr.length-1);
    }

    static void rearrange(int arr[],int i,int j)
    {
        while(true)
        {
            while(arr[i] < 0 && i<j)
                i++;
            while(arr[j] > 0 && i<j)
                j--;
            if(i<j)
            {
                swap(arr[i],arr[j]);
            }
            else
                break;
        }
        System.out.println("The sorted array is "+Arrays.toString(arr));
    }

    static void swap(int a,int b)
    {
        int temp=0;
        temp=a;
        a=b;
        b=temp;
    }
}