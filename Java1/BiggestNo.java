import java.util.*;
import java.io.*;

class BiggestNo {
	public static void main (String[] args) {
		System.out.println("GfG!");
		
		int a[]={4,5,6,7,8};
		int hash[]=new int[10];
		for(int i=0;i<5;i++)
		{
		    hash[a[i]]++;
		}
		
		for(int j=9;j>0;j--)
		{
		    for(int k=0;k<hash[j];k++)
		    {
		        System.out.print(j);
		    }
		}
    }
}