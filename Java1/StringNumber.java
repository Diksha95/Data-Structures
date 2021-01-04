import java.util.*;
class StringNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=IntToString(n);
        System.out.println(s);
    }

public static String IntToString(int number)
{
   // int StringConvet = 48;

    int eachDigit =0;
    int afterDivide = number;
    String reVal = "";

    while(afterDivide >0)
    {
        eachDigit = afterDivide % 10;
        afterDivide = afterDivide / 10;
        if(eachDigit == 0)
        {
            reVal += "0";
        }
        else if(eachDigit == 1)
        {
            reVal += "1";
        }
        else if(eachDigit == 2)
        {
            reVal += "2";
        }
        else if(eachDigit == 3)
        {
            reVal += "3";
        }
        else if(eachDigit == 4)
        {
            reVal += "4";
        }
        else if(eachDigit == 5)
        {
            reVal += "5";
        }
        else if(eachDigit == 6)
        {
            reVal += "6";
        }
        else if(eachDigit == 7)
        {
            reVal += "7";
        }
        else if(eachDigit == 8)
        {
            reVal += "8";
        }
        else if(eachDigit == 9)
        {
            reVal += "9";
        }
    }
    String reVal2 = "";
    for(int index =  reVal.length() -1 ; index >= 0 ; index--)
    {
        reVal2 += reVal.charAt(index);
    }
    return reVal2;
}
}