class PrintHyphenAsterisk{

	public static void main(String args[]){
		
		String s = "21462675756";
		System.out.println(printEventOdd(s));
		
	}
	public static String printEventOdd(String str){
		
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i = 0;i<str.length()-1;i++){
		
			int a = Integer.parseInt(""+str.charAt(i));
			int b = Integer.parseInt(""+str.charAt(i+1));
			
			if(a!=0 && b!=0 && a%2==0 && b%2==0) sb.append('*');
			if(a!=0 && b!=0 && a%2!=0 && b%2!=0) sb.append('-');
			
			sb.append(str.charAt(i+1));
		}
		return sb.toString();
	}
}