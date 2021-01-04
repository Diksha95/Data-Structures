import java.util.*;
class Smurf
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int no_of_smurf=sc.nextInt();
			String arr=new String[no_of_smurf];
			for(int j=0;j<no_of_smurf;j++)
			{
				arr[j]=sc.nextLine();
			}
			for(int k=0;k<no_of_smurf;k++)
			{
				if(arr[k]=="R" && arr[k+1]=="G")
				{	arr[k]="B";
				}

			}
		}

	}
}