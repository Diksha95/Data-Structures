class PrintCommonPrefix{

	public static void main(String args[]){
	
		String a = "Banglore";
		String b = "Manglore";
	
		System.out.println(printCommon(a,b));
	}

	public static String printCommon(String a,String b){
	
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<a.length();i++){
		
			if(a.charAt(i) == b.charAt(i)){
				
				sb.append(a.charAt(i));
			
			}
		}
	
		return sb.toString();
	}
}