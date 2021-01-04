/* Scramble String using Recursion
Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
Below is one possible representation of A = “great”:
 great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
To scramble the string, we may choose any non-leaf node and swap its two children.

For example, if we choose the node “gr” and swap its two children, it produces a scrambled string “rgeat”.

    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
We say that “rgeat” is a scrambled string of “great”.

Similarly, if we continue to swap the children of nodes “eat” and “at”, it produces a scrambled string “rgtae”.

    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
We say that “rgtae” is a scrambled string of “great”. 
Problem Statement Link : https://www.geeksforgeeks.org/check-if-a-string-is-a-scrambled-form-of-another-string/
*/

import java.util.*;
class ScrambleString {

    static HashMap<String,Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings");
        String a=sc.next();
        String b=sc.next();
        if(a.length() != b.length())
        System.out.println("Check cannot be performed as strings are of different length");
        else
        System.out.println("The given strings are scrambled ? " +solve(a,b));
        sc.close();
    }

        public static boolean solve(String a,String b){
       
        if(a.compareTo(b)==0) // If no swapping is perfomed
        return true;
        else if(a.length()<= 1)  //if string is of 0 length
        return false;
        
        String keyValue=a+" "+b;

        if ( map.containsKey(keyValue) ) {
            return map.get(keyValue);
        }

        int n=a.length();
        boolean flagScramble=false;
        for(int i = 1;i <= n-1;i++){
            
            // case 1: a=great b=eatgr Swapping is performed for smaller values of a and b
            boolean cond1=(solve(a.substring(0, i),b.substring(n - i,n)) && solve(a.substring(i, n),b.substring(0, n-i)));
            // case 2: a=great b=great Swapping is not performed for smaller values of a and b
            boolean cond2=(solve(a.substring(0, i),b.substring(0, i))  && solve(a.substring(i, n),b.substring(i, n)));
 
             if(cond1 || cond2){
                flagScramble = true;
                break;
            }
        }
        map.put(keyValue, flagScramble);
        return flagScramble;
    } 
}
    