/* https://leetcode.com/problems/target-sum/ */
class TargetSum {
		
	public static void main(String args[]){
		
		int arr[]={1,1,1,1,1};
		int S=3;
		
		System.out.println("The count is "+ findTargetSumWays(arr,S));
	}
      public static int findTargetSumWays(int[] a, int s) {
        int sum = 0;
        int n = a.length;
        if(n==1){
            if(a[0]==s || a[0]==(-s)){
             return 1;
            }else{
              return 0;
            }
        }
        int count0 = 0;
        for(int i = 0;i<a.length;i++){
            sum+=a[i];
            if(a[i]==0){
                count0++;
            }
        }
        if(sum<s || (s+sum)%2 !=0){
            return 0;
        }
        int s1 = (s+sum)/2;
        int ans = countSubsetSum(a,s1,n);
        return ((int)Math.pow(2,count0)) * ans;
     }
    public static int countSubsetSum(int[] arr, int s,int n) {
    int t[][] = new int[n+1][s+1];
    for(int i=0;i<n+1;i++)
    {
        for(int j=0;j<s+1;j++)
        {
            if(i==0)
                t[i][j]=0;
            if(j==0)
                t[i][j]=1;
        }
    }
    for(int i = 1;i<n+1;i++){
        for(int j = 1;j<s+1;j++){
            if(arr[i-1]==0)
            {
                t[i][j]=t[i-1][j];
            }
            else if(arr[i-1]<=j){
                t[i][j] = ((t[i-1][j-arr[i-1]]) + (t[i-1][j]));
            }
            else{
                t[i][j] = t[i-1][j];
            }
        }
    }
    return t[n][s];
    }

}   
