class ReverseAddFunction{
	
	public static void main(String args[]){
		
		int n = 195;
		
		System.out.println(isRepeatPalindrome(n));
	
	}
	
	public static boolean isRepeatPalindrome(int n){
	
		int num = reverseNumber(n);
		
		int sum = num + n;
		
		if(isPalindrome(sum)){
			System.out.println(sum);
			return true;
		}
		else {
			return isRepeatPalindrome(sum);
		}
	}
	
	public static int reverseNumber(int n){
	
		String s = Integer.toString(n);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<s.length();i++){
			
			sb.append(s.charAt(i));
		}
		 return Integer.parseInt(sb.reverse().toString());
	}
	
	public static boolean isPalindrome(int num){
		
		String s = Integer.toString(num);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<s.length();i++){
			
			sb.append(s.charAt(i));
		}
		 return Integer.parseInt(sb.reverse().toString()) == num;
	}
}