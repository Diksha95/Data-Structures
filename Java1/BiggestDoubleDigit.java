import java.util.*;
import java.io.*;

class BiggestDoubleDigit {
	public static void main (String[] args) {
		
		int a[]={41,54,66,78,89};
		String arr[]=new String[a.length];
		for(int i=0;i<5;i++)
		{
		    arr[i]=String.valueOf(a[i]);
		}
        
        Arrays.sort(arr,(o1,o2)->{
            String s1=o1+o2;
            String s2=o2+o1;
            return s2.compareTo(s1);
        });
        String largestNo=new String();
        for(String aString:arr)
        {
            largestNo+=aString;
        }
        System.out.println(largestNo);
    }

}