import java.util.Scanner;
class ReverseString
{
    public static void main(String[] args) {
        
        String s=new String("DikshaSharma");
        for (int i=s.length()-1;i>0;i--)
        {
            System.out.print(s.charAt(i));
        }
        System.out.print(s.charAt(s.length()-1));
    }
}