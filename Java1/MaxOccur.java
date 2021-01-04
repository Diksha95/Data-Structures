import java.util.*;
import java.lang.*;
import java.io.*;

class MaxOccur
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc=new Scanner(System.in);
        String s=new String("aaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccc");
        TreeMap<Character,Integer>map=new TreeMap<>();
        int maxOccur=Integer.MIN_VALUE;
        char maxChar=' ';
        //char secMax=' ';
        //int secondMax=0;
        for(int i=0;i<s.length();i++)
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
        
        for(Map.Entry<Character,Integer> m: map.entrySet())
        {
            if(maxOccur<m.getValue())
            {
                maxOccur=m.getValue();
                 maxChar=m.getKey();                
             }
            //System.out.println(m.getKey()+" "+m.getValue());
            
        }
        System.out.println("Maximum Ocuuring character in the string is "+maxChar+" and frequency of occuring is "+maxOccur);
        
	}
}
/*Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.print(m.getKey());
			System.out.print(m.getValue());
		}
*/