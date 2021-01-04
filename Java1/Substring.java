import java.util.*;
class Substring
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String sub="";
		for(int i=0;i<s.length();i++)
		{
			sub=s.substring(0,i+1);
			System.out.println("Substring of length "+(i+1)+" is "+sub);
		}
		//mysub(s,1,4);
	}
	// Method to find substring without using any standard library function
	/*static void mysub(String s,int low,int high)
	{
		if(low<=high)
		{
			System.out.print(s.charAt(low));
			mysub(s,low+1,high);
		}

	}*/
}