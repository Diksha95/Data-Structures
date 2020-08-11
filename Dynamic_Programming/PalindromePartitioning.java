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
        //char ch[]=s.toCharArray();
        System.out.println("The min no of palindrome partitions required are :"+palindromePartition(s,0,s.length()-1));
    }

    static int palindromePartition(String s,int i,int j)
    {
       // String s=new String(ch);
        int min=Integer.MAX_VALUE;  
        int left,right;
        for(int m=0;m<1001;m++)
        {
            for(int n=0;n<1001;n++)
            t[m][n]=-1;
            
        }
        if(i>=j )
        return 0;
        if(isPalindrome(s,i,j))
        return t[i][j]=0;
        if(t[i][j]!=-1)
        return t[i][j];
        for(int k=i;k<=j-1;k++)
        {
            if(t[i][k]!=-1)
            left = t[i][k];
            else
            left=palindromePartition(s,i,k);
            t[i][k]=left;

            if(t[k+1][j]!=-1)
            right = t[k+1][j];
            else
            right=palindromePartition(s,k+1,j);
            t[k+1][j]=right;

            int temp= 1 + left + right;
            if(temp < min)
            min = temp;
        }
        //System.out.println("Code reached upto here 2");
        return t[i][j]=min;
     
    }

    private static boolean  isPalindrome(String s, int i, int j) {	
		while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
                i++;
                j--;
            }
            return true;
         }
	}
