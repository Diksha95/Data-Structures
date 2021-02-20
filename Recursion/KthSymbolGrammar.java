import java.lang.Math;
class KthSymbolGrammar{

	public static void main(String args[]){
	
	int N = 4;int K = 5;
	System.out.println("Grammar for given N and K is "+solve(N,K)); 
	}
	
	public static int solve(int N,int K){
	
		if(N==1 && K==1)
			return 0;
		
		int mid = (int)(Math.pow(2,N-1))/2;
		
		if(K<=mid)
			return solve(N-1,K);  //if k lies in the first half where grammer for N is equals to N-1
		else{
			if(solve(N-1,K-mid)==0)
				return 1;
			else	
				return 0;
		}  //Negation because second half is the complement of N-1 first half
	}
}