import java.util.*;
class ConvertRoman
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int num=sc.nextInt();
			String m[]={"","M","MM","MMM"};
			String c[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","DM"};
			String x[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
			String i[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
			String ans=m[num/1000]+c[(num%1000)/100]+x[(num%100)/10]+i[num%10];
			System.out.println(ans);
		}
		
	}
}
