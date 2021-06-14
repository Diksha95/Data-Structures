class LongestPalindromicSubstring{

	public static void main(String args[]){
	
		String str = "abacdfgdcaba";
		System.out.println(longestPalindrominc(str));
	}
	
	public static String longestPalindrominc(String str){
		
		String result = "";
		int n = str.length();
		boolean dp[][] = new boolean[n][n];
		int max = 0;
		for(int j = 0;j<n;j++){
			
			for(int i = 0 ; i<=j;i++){
				
				boolean con = str.charAt(i) == str.charAt(j);
				
				// checking for length greater than 2
				dp[i][j] = j-i > 2 ? dp[i+1][j-1] && con : con;
				
				if(dp[i][j] && j-i+1>max){
					max = j-i+1;
					result = str.substring(i,j+1);
				}
			}	
		}
	
		return result;
	}

}