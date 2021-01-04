//Minimum integer value
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		sc.nextLine();
		for(int j=0;j<test;j++)
		{	
		    String s=sc.nextLine();
		    IntArray(s);
	}
		}
		static void IntArray(String s)
		{
			ArrayList<Integer>list=new ArrayList<>();
			for(int i=0;i<s.length();i++)
			{
				int j=Character.digit(s.charAt(i),10);
				list.add(j);
			}
			int count=list.get(0);
			for(int i=1;i<list.size();i++)
			{
				if(list.get(i)==0 || list.get(i)==1 || list.get(i-1)==0 || list.get(i-1)==1)
				{
					count+=list.get(i);
				}
				else
				{
					count*=list.get(i);
				}
			}
			System.out.println("Maximum value is "+ count);
		}
}