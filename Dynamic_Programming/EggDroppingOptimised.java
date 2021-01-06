import java.util.HashMap;
import java.util.Scanner;

public class EggDroppingOptimised {
    
    static HashMap<String,Integer> map=new HashMap<>();
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

        String keyValue=e+ " "+ f;
        if(f==0 || f==1)
            return f;
        else if(e==1)
            return f;

        if(map.containsKey(keyValue))
        return map.get(keyValue);
        
        int mn=Integer.MAX_VALUE;
        int low=1;int high=f;

        while(low<=high){
            int k=(low+high)/2;

            int down=eggDrop(e-1, k-1);
            int up=eggDrop(e, f-k);

            int temp=1 + Math.max(down,up); // +1 because we have used one attempt

            if(down<up)//if down attempts are less we only require upper ones and vise versa
                low=k+1;
            else 
                high=k-1;
                
            mn=Math.min(mn,temp);
        }
        map.put(keyValue, mn);
        return mn;
        
    }
}