import java.util.*;
class BalancedPara{
	
	public static void main(String args[]){
		int n=3;
		String output="";
		int open=n;
		int close=n;
		List<String> res=new ArrayList<>();
		solve(open,close,output,res);
		res.stream().forEach(System.out::println);
	}
	
	public static void solve(int open,int close,String op,List<String>res){
	
		if(open==0 && close==0){  //If we reached till leaf node of the recursion tree
			res.add(op);
			return;
		}
		
		if(open!=0){
			String op1=op;
			op1+="(";
			solve(open-1,close,op1,res);
		}
		if(close>open){
			String op2=op;
			op2+=")";
			solve(open,close-1,op2,res);
		}
	}
	

}