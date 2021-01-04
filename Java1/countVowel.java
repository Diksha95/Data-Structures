import java.util.*;
class countVowel
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		boolean isVowel=false;
		String vowels="aeiouAEIOU";
		int vocount=0;
		int concount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			for(int in=0;in<vowels.length();in++)
			{
					if(vowels.charAt(in)==ch)
					{
						vocount++;
						isVowel=true;
						break;
					}	
				}
			if(!isVowel && Character.isLetter(ch))
				{ concount++;}
		}
		System.out.println("The number of vowels is: "+vocount);
		System.out.println("The number of consonants is: "+concount);
	}
}