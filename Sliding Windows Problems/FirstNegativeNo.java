/*https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k/0# */
import java.util.*;

class FirstNegativeNo {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++){
		    
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    int arr[]=new int[N];
		    for(int i=0;i<N;i++){
		        
		        arr[i]=sc.nextInt();
		    }
		    
		    firstNegative(arr,N,K);
        }
        sc.close();
	}
	
	public static void firstNegative(int arr[],int N,int k){
	    
		// N-K+1 is the size of the resulting negative list
		System.out.println("**********************************");
		int temp=0;
       for(int i=0;i<(N-k+1);i++){
		    
			int j=0;
		   //Traversing through the current window to find the negative element
		   for(j = i; (temp>=0&&j<(i+k)); j++){
			   
			   if(arr[j]<0)
				temp=arr[j];
		   }
		   //Printing the first negative integer in the current window
		   if(temp<0)
			System.out.print(temp+" ");
			
		//Reintialising temp for next window and removing the current negative number for past window 
		if(arr[i]==temp)
		temp=0;
		
		if(j==i+k)
		System.out.print("0 ");
	   }
	   
	}
}