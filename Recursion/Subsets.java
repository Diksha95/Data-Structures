/* https://leetcode.com/problems/subsets/ 
Leetcode Problem 78*/
import java.util.*;
class Subsets{

	public static void main(String args[]){
	
		int nums[]={1,2,3};
		Arrays.sort(nums);
		Set<List<Integer>> result=new HashSet<>() ; //to avoid duplicate terms
		findPowerSet(nums,0,new ArrayList<Integer>(),result);
		result.stream().forEach(System.out::println);
	}
	
	public static void findPowerSet(int ip[],int pos,List<Integer>op,Set<List<Integer>>res){
	
		if(pos==(ip.length)){  //To check whether we reached at the last element
			res.add(op);
			return;
		}
		List<Integer> op1=new ArrayList<Integer>();
		List<Integer> op2=new ArrayList<Integer>();
		op1.addAll(op);
		op2.addAll(op);
		op2.add(ip[pos]);  //Decision has been made for first element of the input array
		findPowerSet(ip,pos+1,op1,res);  //Calling for smaller input
		findPowerSet(ip,pos+1,op2,res);  //Calling for smaller input
		return;
	}

}