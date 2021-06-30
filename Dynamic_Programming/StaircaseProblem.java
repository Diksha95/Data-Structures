class StaircaseProblem{
	
	public static void main(String args[]){
		
		int n = 4;
		
		//Brute force solution
		System.out.println(getBruteForce(n));
		//Better Approach solution
		System.out.println(getBetterApproach(n));
		//Best approach
		System.out.println(bestApproach(n));
	}
	
	//Brute force solution with complexity O(2^n)
	public static int getBruteForce(int n){
		
		if(n<=2) 
			return n;
		else 
			return getBruteForce(n-1) + getBruteForce(n-2);
	}

	//Better Approach
	//O(n) time and O(n) space
	public static int getBetterApproach(int n){
		
		int t[] = new int[n+1];
		
        if(n<=2)
            return n;
        
		t[0] = 0;
		t[1] = 1;
		t[2] = 2;
		for(int i = 3;i<=n;i++){
			t[i] = t[i-1] + t[i-2];
		}
		return t[n];
	}
	
	//Best approach O(n) time and O(1) space
	public static int bestApproach(int n) {
        
        if(n<=2){
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 2;
        
        while(n-->2){
            a = b+c;
            b = c;
            c = a;
        }
        return a;
    }
}