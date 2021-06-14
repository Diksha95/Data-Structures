class PrintAllSubsets{
	
	public static void main(String args[]){
		
		String ip="abc";
		String op="";
		findSubsets(ip,op);
	}
	
	public static void findSubsets(String ip,String op){
		
		if(ip.length()==0){
			System.out.print(op+" ");  //When input is getting empty we are getting one solution
			return;
		}
		String op1=op;
		String op2=op;
		op2+=ip.charAt(0); //because here we are considering to add 'a'
		
		ip=ip.substring(1);   // a has been removed from string because decision has been made for a
		findSubsets(ip,op1);//Calling on smaller input  for empty branch
		findSubsets(ip,op2); // a has been calculated
		return;
	}
}