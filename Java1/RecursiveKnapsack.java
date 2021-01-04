import java.util.Scanner;
class RecurisveKnapsack
{
    public static void main(String[] args) {
        int V[]={60,100,120};
        int Wt[]={10,20,30};
        int W=50;
        int n=V.length;
        System.out.println("The profit is : "+recursiveKnap(W, Wt, V, n));

    }
    static int max(int a,int b)
    {
        return (a>b?a:b);
    }

    static int recursiveKnap(int W,int wt[],int val[],int n)
    {
        if(n==0 || W==0)
        return 0;
        else if (wt[n-1]<=W)
        return max(val[n-1]+recursiveKnap(W-wt[n-1], wt, val, n-1),recursiveKnap(W, wt, val, n-1));
        else
        return recursiveKnap(W, wt, val, n-1);
    }
}