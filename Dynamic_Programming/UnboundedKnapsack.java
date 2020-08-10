public class UnboundedKnapsack {
    public static void main(String[] args) {
        int V[]={60,100,120};
        int Wt[]={10,20,30};
        int W=50;
        int n=V.length;
        int t[][]=new int[n+1][W+1];
        System.out.println("The maximum profit in case of Unbounded Knapsack would be : "+unboundKnap(Wt, V, W,t));
    }
   static int unboundKnap(int wt[],int v[],int W,int t[][])
   {   int n=v.length;
       for (int i=0;i<=n;i++)
       {
           for(int j=0;j<=W;j++)
           {
               t[i][j]=0;
           }
       }
       for(int i=1;i<n+1;i++)
       {
           for(int j=1;j<W+1;j++)
           {
               if(wt[i-1]<=j)
               {
                   t[i][j]=max(v[i-1]+t[i][j-wt[i-1]],t[i][j]);
               }
               else
               t[i][j]=t[i-1][j];
           }
       }
       return t[n][W];
   }
   static int max(int i,int j)
   {
       return i>j?i:j;
   }
}