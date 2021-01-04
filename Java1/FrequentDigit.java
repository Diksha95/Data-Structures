import java.util.*;
class FrequentDigit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int num=n;
		int r;
		while(num>0)
		{
			r=num%10;
			if(map.containsKey(r))
			{
				map.put(r,map.get(r)+1);
			}
			else
			{
				map.put(r,1);
			}
			num=num/10;
		}
		for(Map.Entry<Integer,Integer> m:map.entrySet())
		{
			System.out.println("Frequency of digit "+m.getKey()+" is "+m.getValue());
		}
	}
}