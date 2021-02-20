class PermutationCaseChange{

	public static void main(String args[]){
	
		String ip="abc";
		String op="";
		
		solve(ip,op);
	}
	
	public static void solve(String input,String op){
	
		if(input.length()==0){
			System.out.print(op+" ");
			return;
		}
		String op1=op;
		String op2=op;
		op1+=input.charAt(0);
		op2+=Character.toUpperCase(input.charAt(0));
		solve(input.substring(1),op1);
		solve(input.substring(1),op2);
		return;
	}
}