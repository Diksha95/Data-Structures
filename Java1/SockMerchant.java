import java.util.*;
class SockMerchant
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int totalPairs=sockCheck(arr, n);
        System.out.println(totalPairs);
        sc.close();
    }

    public static int sockCheck(int arr[],int n) {
        
        Set<Integer> color=new HashSet<>();
        int pairs=0;
        for(int i=0;i<n;i++)
        {
            if(!color.add(arr[i])) {
                pairs++;
                color.remove(arr[i]);
              }  
        }
        return pairs;
    }
}