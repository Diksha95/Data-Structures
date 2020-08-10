/* Given a string, a partitioning of the string is a palindrome partitioning if every substring of the 
partition is a palindrome. 
Example:
  “aba|b|bbabb|a|b|aba” is a palindrome partitioning of “ababbbabbababa”. 
    
  Problem Statement Link : https://www.geeksforgeeks.org/palindrome-partitioning-dp-17/  
  */
public class PalindromePartitioning {
    static int t[][]=new int[1001][1001];
    public static void main(String[] args) {
        String s ="ababbbabbababa";
        char ch[]=s.toCharArray();
        System.out.println("The min no of palindrome partitions required are :"+
        palindromePartition(ch,1,(s.length())-1));
    }

    static int palindromePartition(char []ch,int i,int j)
    {
        String s=new String(ch);
        int min=Integer.MAX_VALUE;
        for(int m=0;m<1001;m++)
        {
            for(int n=0;n<1001;n++)
            t[m][n]=-1;
            
        }
        if(i>=j)
        return 0;
        else if(isPalindrome(s))
        return 0;
        else if(t[i][j]!=-1)
        return t[i][j];
        for(int k=i;k<=j-1;k++)
        {
            int temp= 1 + palindromePartition(ch,i,k)+palindromePartition(ch,k + 1,j);
            if(temp < min)
            min=temp;
        }
        return t[i][j]=min;
    }

    static boolean isPalindrome(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        sb=sb.reverse();
        if(s.equalsIgnoreCase(sb.toString()))
        return true;
        else
        return false;
    }
}