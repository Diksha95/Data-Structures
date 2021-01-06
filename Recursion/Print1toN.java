import java.util.Scanner;

public class Print1toN {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to print");
        int n=sc.nextInt();
        Print(n);
        sc.close();
    }

    public static void Print(int n){

        if(n==0)
        return;
        Print(n-1);
        System.out.print(n+" ");
    }
}