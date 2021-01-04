import java.util.*;
class Converter
{
	static String IntToString(int number)
	{
		int n=number;
		int d=0;
		String val="",val1="";
		while(n>0)
		{
			d=n%10;
			n=n/10;
			switch(d)
			{
				case 1:val+=1;
				break;
				case 2:val+=2;
				break;
				case 3:val+=3;
				break;
				case 4:val+=4;
				break;
				case 5:val+=5;
				break;
				case 6:val+=6;
				break;
				case 7:val+=7;
				break;
				case 8:val+=8;
				break;
				case 9:val+=9;
				break;
			}
		}
		for(int i=val.length()-1;i>=0;i--)
		{
			val1+=val.charAt(i);
		}
		return val1;
	}
		 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=IntToString(n);
        System.out.println(s);
    }
}