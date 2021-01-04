import java.util.*;
class ArrayRotation
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int d=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		d=d%n;
		leftRotate(arr,d,n);
		System.out.print("The rotated array is ");
		for (int j=0;j<n;j++) 
		{
			System.out.print(arr[j]+" ");
		}
	}
	static void leftRotate(int arr[], int d, int n)
		{
  			int i;
  			for (i = 0; i < d; i++)
   			leftRotatebyOne(arr, n);
			}
 
	static void leftRotatebyOne(int arr[], int n)
		{
  				int i, temp;
  				temp = arr[0];
  				for (i = 0; i < n-1; i++)
     			{	arr[i] = arr[i+1];

  				}
  				arr[n-1] = temp;
				}
}