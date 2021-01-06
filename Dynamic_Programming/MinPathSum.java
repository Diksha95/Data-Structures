/* https://leetcode.com/problems/minimum-path-sum/ 
Complexity is 0(m*n)
*/
class MinPathSum{
	
	public static void main(String args[]){
	
		 int cost[][] = {9,1,4,8};

		//cost[0].length means number of columns
		System.out.println("The minimum path required to reach (m,n) is "+getMinCostPath(cost,cost.length,cost[0].length));
	}
	
	public static int getMinCostPath(int cost[][],int m,int n){
	
	int t[][]=new int[m][n];
	
	t[0][0]=cost[0][0];
	
	for(int i=1;i<m;i++){
		
			t[i][0]=t[i-1][0]+cost[i][0];
		
	}
	
	for(int j=1;j<n;j++){
			
			t[0][j]=t[0][j-1]+cost[0][j];
			
		}
	for(int i=1;i<m;i++){
		
		for(int j=1;j<n;j++){
			
			t[i][j]=cost[i][j]+Math.min(t[i][j-1],t[i-1][j]);
		}
	}
	
		return t[m-1][n-1];

	}
}