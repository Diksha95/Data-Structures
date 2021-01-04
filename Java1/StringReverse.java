class StringReverse
{
	public static void main(String[] args) {
		
	String s=new String("DikshaSharma");
		String d="";
	// for(int i=s.length()-1;i>=0;i--)
	// {
	// 	char ch=s.charAt(i);
	// 	d=d+ch;
	// }
	// System.out.println(d);
		reverse(s,0);
}
static void reverse(String s,int index)
{	
	if(index<s.length()-1)
	{
		reverse(s,index+1);
	}
	System.out.print(s.charAt(index));
}
}
