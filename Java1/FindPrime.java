import java.util.*;
class FindPrime {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int pr = s.nextInt();  
        for (int i=1;i<=pr;i++)
        {
            if(checkPrime(i))
                System.out.print(i+" ");
        }
     
    }

    public static boolean checkPrime(int pr)
    {
        for(int i = 2; i <= pr/2; ++i)
        {
            // condition for nonprime number is that if number leaves a remainder 0.For prime numbers if number leaves a remainder 1
            //its not a prime number 
            int rem=pr%i;

            if(rem==0)
            {
                return false;
            }
            else 
                return true;
        }
         
            return false;
    }
}



/*
Things to remember for a prime number
1.Prime number cannot be divided more than its half
2.So we need to iterate till its half only
3.if remainder comes out be zero means its not a prime number
*/