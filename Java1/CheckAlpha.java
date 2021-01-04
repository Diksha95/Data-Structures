import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class CheckAlpha
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println("The entered string is "+s);
        Boolean b[]=new Boolean[26];
		for(char c:s.toCharArray())
		{
			if(c >='a' && c< ='z')
			{
				b[c-'a']=true;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(!b[i])
			{
				System.out.println("The alphabets which are not present in the current string are "+(char)97+i);
			}
		}
        
    }
}