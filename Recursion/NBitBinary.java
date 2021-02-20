import java.util.*;
class NBitBinary{
	
	public static void main(String args[]){
	
		int n=3;
		String output="";
		int one=0;
		int zero=0;
		Set<String> res=new HashSet<>();
		solve(one,zero,output,res,n);
		System.out.println(res);
	}
	public static void solve(int one,int zero,String op,Set<String>res,int n){
	
		if(n==0){
			res.add(op);
			return;
		}
		String op1=op;
		op1+="1";
		solve(one+1,zero,op1,res,n-1);
		if(one>zero){
			String op2=op;
			op2+="0";
			solve(one,zero+1,op2,res,n-1);
		}
	}
}