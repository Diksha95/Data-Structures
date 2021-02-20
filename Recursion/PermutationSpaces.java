class PermutationSpaces{

	public static void main(String args[]){
	
		String input="ABC";
		String output="";
		//Removing the leftmost space case as we are not considering space before A
		output+=input.charAt(0);
		input=input.substring(1);
		solve(input,output);
	}
	
	public static void solve(String input,String op){
	
		if(input.length()==0){
			System.out.print(op+" ");
			return;
		}
		String op1=op;
		String op2=op;
		op1+="_";
		op1+=input.charAt(0);
		op2+=input.charAt(0);
		solve(input.substring(1),op1);
		solve(input.substring(1),op2);
		return;
	}
}