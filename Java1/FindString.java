import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class FindString
{
    public static void main(final String arr[]) {
        System.out.println("Enter the number the strings you want to enter");
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final String[] str = new String[n];
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        checkString(str);
        sc.close();
    }

    public static void checkString(final String[] str) {
        final ArrayList<String> ar = new ArrayList<String>();
        for (int j = 0; j < str.length; j++) {
            if (str[j].contains("1") && str[j].contains("2") && str[j].contains("3"))
                ar.add(str[j]);
        }
              
        final ArrayList<Integer> result = new ArrayList<Integer>();
        for(String stringValue : ar) {
            result.add(Integer.parseInt(stringValue));
        }    

        Collections.sort(result);
           System.out.println("The sorted array is :"+ result); 
    }
 }