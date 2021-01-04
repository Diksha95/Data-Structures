/*// Java implementation of recursive Binary Search */
class BinarySearch
{
    // Returns index of x if it is present in arr[l..r], else
    // return -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
 
            // If the element is present at the middle itself
            if (arr[mid] == x)
               return mid;
 
            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid+1, r, x);
        }
 
        // We reach here when element is not present in array
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
}

/* This code is contributed by Rajat Mishra */
/* import java.util.*;
class BinarySearch
{
    static int Binary(int arr[],int l,int u,int key)
    {

        if(l<u)
        {
        int mid=(l+u)/2;
        if(arr[mid]==key)
            return mid;
        else if(arr[mid]< key)
        {
            return Binary(arr,l,mid-1,key);
        }
        else
        {
            return Binary(arr,mid+1,u,key);
        }
    }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        System.out.println("Enter array elements :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=0;
        int u=n-1;
        int x=0;
        x=Binary(arr,l,u,key);
        if(x==-1)
        {
            System.out.println("Element not found");
        }
        else
        System.out.println("The element "+key+" is found at location "+Binary(arr,l,u,key));
    }
} */