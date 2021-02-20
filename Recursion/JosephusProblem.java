import java.util.*;
class JosephusProblem{

	public static void main(String args[]){
	
		int n=40;
		int k=7;
		int sword=0;
		List<Integer> v=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			v.add(i);
		}
		System.out.println(solve(v,k,sword));
	}
	
	public static int solve(List<Integer>v,int k,int index){
		
		if(v.size()==1){
			return v.get(0);
		}
		index=(index+k-1)%(v.size());
		v.remove(index);
		return solve(v,k,index);
	}
}