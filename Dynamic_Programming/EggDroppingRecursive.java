import java.util.Scanner;

/* Egg Dropping using Recursion
Problem statement: You are given N floor and K eggs. You have to minimize the number of times you have to
drop the eggs to find the critical floor where critical floor means the floor beyond which eggs start to 
break.

Assumptions of the problem:
If egg breaks at ith floor then it also breaks at all greater floors.
If egg does not break at ith floor then it does not break at all lower floors.
Unbroken egg can be used again.

Note: You have to find minimum trials required to find the critical floor not the critical floor.

Problem Statement Link :https://leetcode.com/problems/super-egg-drop/
*/
public class EggDroppingRecursive {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of floors");
        int f=sc.nextInt();
        System.out.println("Enter the number of eggs");
        int e=sc.nextInt();
        System.out.println("Minimum number of attempts required to find the critical floor "+ eggDrop(e,f));
        sc.close();
    }

    public static int eggDrop(int e,int f){

        if(f==0 || f==1)
            return f;
        else if(e==1)
            return f;
 
        int mn=Integer.MAX_VALUE;
        for(int k=1;k<=f;k++){

            int temp=1 + Math.max(eggDrop(e-1, k-1), eggDrop(e, f-k)); // +1 because we have used one attempt
            mn=Math.min(mn,temp);
        
        }
        return mn;
    }

}