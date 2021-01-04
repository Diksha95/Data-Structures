import java.util.*;
class DistinctK
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> map=new HashMap<>();
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the length of k");
		int k=sc.nextInt();
		int dist=0,res=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				char ch=s.charAt(j);
				if(map.containsKey(ch))
				{
					map.put(ch,map.get(ch)+1);
				}
				else
				{
					map.put(ch,1);
					dist++;
				}
			}
		}
		System.out.println(dist);
		if(dist==k)
		{
			res++;
		}
		System.out.println(res);
	}
}