import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class RepeatedString
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the repeated string");
        String s=sc.next();
        sc.nextLine();
        System.out.println("Enter the no of repeation");
        int n=sc.nextInt();
        System.out.println("No of a's"+repeatedString(s,n));
        sc.close();
    }

    public static long repeatedString(String s,long n)
    {
        int quo=(int)n/s.length();
        int rem=(int)(n%s.length());
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            count++;
        }
            long total=(int)quo*count;
            if(rem==0)
            return total;
            else
            {
                for(int i=0;i<rem;i++)
                {
                    char ch=s.charAt(i);
                    if(ch=='a')
                    total++;
                }
            }
        return total;

    }
}