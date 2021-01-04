import java.util.Scanner;
class BinarySearchEx
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {2,3,4,10,40};
        System.out.println("Enter the number you want to search");
        int x=sc.nextInt();
        System.out.println("The number is present at "+ BinarySearch(arr,1,arr.length,x)+" location");
    }

    public static int BinarySearch(int arr[],int l,int u, int x)
    {
        if(l<u)
        {
            int mid=(l+u-1)/2;
            if(arr[mid]==x)
            return mid;
            else if(arr[mid]>x)
            return BinarySearch(arr, l, mid-1, x);
            else
            return BinarySearch(arr, mid+1, u, x);
        }
        return -1;
    }
}