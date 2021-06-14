class Permutation{

	public static void main(String args[]){
	
		String str = "abc";
		getPermutation(str);
	}

	public static void getPermutation(String str){
		
		int n = str.length();
		int f = factorial(n);
		//Since starting with string abc
		//List<String> arr = new ArrayList<>();
		for(int i = 0;i<f;i++){
			int temp = i;
			StringBuilder sb = new StringBuilder(str);
			StringBuilder op = new StringBuilder();
			for(int div = n;div >= 1;div--){
			
				int q = temp/div;
				int r = temp%div;
				
				op.append(sb.charAt(r));
				sb.deleteCharAt(r);
				temp = q;
			}
			System.out.print(op);
			System.out.println();
		}
	
	}
	public static int factorial(int n){
		
		int p = 1;
		
		for(int i = 2;i<=n;i++){
			
			p*=i;
		}
		return p;
	}

}