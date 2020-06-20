import java.util.*;
public class FormBiggestNo {
    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int n=sc.nextInt();
		   ArrayList<String> numbers=new ArrayList<>();
		    for(int j=0;j<n;j++)
		    {
		        numbers.add(String.valueOf(sc.nextInt()));
		    }
		    
		    biggestNo(numbers);
		    System.out.println();
		}
		sc.close();
	}
		
		static void biggestNo(ArrayList<String>arr)
		{
		    Collections.sort(arr,new Comp());
		    for(String s:arr)
		    {
		        System.out.print(s);
		    }
		    
		}
		
		public static class Comp implements Comparator<String>
		{
		    public int compare(String a,String b)
		    {
		        String ab=a+b;
		        String ba=b+a;
		        
		        if(Integer.parseInt(ab)>Integer.parseInt(ba))
		            return -1;
		      else 
		      return 1;
		    }
		}
}