import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class PositioningElements
{
    public static void main(String[] args) {
        int arr[][]={{1, 3, 4}, {5, 2, 9}, {8, 7, 6}};
        HashSet<Integer> set=new HashSet<>();
        //Iterating over rows
        for(int i=0;i<3;i++)
        {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]<min)
                min=arr[i][j];
                if(arr[i][j]>max)
                max=arr[i][j];
            }
            set.add(max);
            set.add(min);
        }
        for(int i=0;i<3;i++)
        {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=0;j<3;j++)
            {
                if(arr[j][i]<min)
                min=arr[j][i];
                if(arr[j][i]>max)
                max=arr[j][i];
            }
            set.add(max);
            set.add(min);
        }
        set.stream().forEach(action ->System.out.print(" "+action));
        System.out.println(" The no of positional elements are :"+set.size());
    }
}