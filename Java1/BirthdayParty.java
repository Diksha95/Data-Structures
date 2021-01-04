import java.util.Scanner;

class BirthdayParty
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of kids");
        int n=sc.nextInt();
        System.out.println("Enter the no of toys");
        int t=sc.nextInt();
        System.out.println("Enter the position to pick");
        int d=sc.nextInt();

        int kidsArray[]=new int[n];
        for(int i=0;i<n;i++)
        {
            kidsArray[i]=sc.nextInt();
        }
        int index=0;
        t=(t+d-1)%n;
        if(t==0)
        index=n-1;
        else
        index=t;

        System.out.println("The kid who got bad toy is "+kidsArray[index]);
        sc.close();

    }
}