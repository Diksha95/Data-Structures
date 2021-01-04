//First non reapeating character
import java.util.*;
class NonRepeat
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0;i<t;i++) 
		{
		    int n=sc.nextInt();
		    sc.nextLine();
		    String s=sc.nextLine();
			non(s,n);
		}
	}
	static void non(String s,int n)
	{
		HashMap<Character,Integer> map=new LinkedHashMap<>();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		boolean flag=false;
		for (Map.Entry<Character,Integer> m: map.entrySet()) 
		{
			if(m.getValue() ==1)
			{	
			    System.out.println(m.getKey());
			    flag=true;
			    break;
			}
		}
		if(!flag)
			{
				System.out.println("-1");
			}
	}
}