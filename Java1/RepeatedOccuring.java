import java.util.*;
import java.lang.*;
import java.io.*;

class RepeatedOccuring
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc=new Scanner(System.in);
        int arr[]={1,1,1,1,6,6,4,4,4,9};
        LinkedHashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int count =linearSearch(arr,arr[i]);
            map.put(arr[i],count);
        }
        
        for(Map.Entry<Integer,Integer> m: map.entrySet())
        {
            System.out.println(m.getKey()+" is occuring "+m.getValue()+" times");
            
        }
        
        
    }
    
    static int linearSearch(int arr[],int x)
    {       int count=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }

        return count;
    }
}
    