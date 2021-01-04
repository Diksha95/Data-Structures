import java.util.*;
class JumpingClouds
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
            int i=0;
            int jumps=0;
        while(i<arr.length-1)
        {       
            if(i+2>=arr.length && arr[i+2]==1)
            {
                jumps++;
                i++;
            }

            else
                i=i+2;
                jumps++;
        }
        System.out.println("No of jumps are"+jumps);
    }
}