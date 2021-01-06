/* https://codeforces.com/problemset/problem/189/A */
class RibbonCutProblem{
	
	public static void main(String args[]){
	
		int N=5;
		int a=5;
		int b=3;
		int c=2;
		
		System.out.println("The maximum number of ways in which ribbon can be cut is "+ maximumRibbonRecursive(N,a,b,c));
		
		System.out.println("The maximum number of ways in which ribbon can be cut is "+ maximumRibbonBottomUp(N,a,b,c));
	}
	
	public static int maximumRibbonRecursive(int n,int a,int b,int c){
		
		
		if(n==0)  //It means if we dont have ribbon then we cannot cut into pieces
			return 0;
		if(n<0)
		
		/*  Min value is returned because in any case if n becomes negative
			then max function will never return minimum value and it will 
			return 0 in that case also.
		*/
			return Integer.MIN_VALUE;  
		else 
			/* 1 is added because whichever piece will be chosen 1 choice has been taken */
			return 1+ Math.max(maximumRibbonRecursive(n-a,a,b,c)
			,Math.max(maximumRibbonRecursive(n-b,a,b,c),maximumRibbonRecursive(n-c,a,b,c)));
	} 
	
	public static int maximumRibbonBottomUp(int n,int a,int b,int c){
		
		int dp[]=new int[n+1];
		
		dp[0]=0; //for n=0
		
		int r1=Integer.MIN_VALUE,r2=Integer.MIN_VALUE,r3=Integer.MIN_VALUE;
		
		for(int i=1;i<=n;i++){
			
			/* These conditions are checked so that our n does not become negative */
			
			if(i>=a)
				r1=dp[i-a];
			if(i>=b)
				r2=dp[i-b];
			if(i>=c)
				r3=dp[i-c];
				
			dp[i]=1+ Math.max(r1,Math.max(r2,r3));
		}
	
			return dp[n];
	} 
}    