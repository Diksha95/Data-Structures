import java.util.*;
class Pattern1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Pattern 1
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{														//  *
																	//	**
			System.out.print("*"+" ");								//	***
			}														//	****
			System.out.println();									//	*****									
		}
		System.out.println();
		//Half pyramid Pattern 2
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		//Pattern 3
		char alpha='A';
		for(int i=1;i<=5;i++)
		{		
			for(int j=1;j<=i;j++)								
			{
				System.out.print(alpha+" ");
		 	}
		 		++alpha;
		 	System.out.println();
		 }
		 System.out.println();
		 //Pattern 4
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{																											
			System.out.print("*"+" ");								
			}														
			System.out.println();																		
		}	
		System.out.println();
		//Pattern 5
		for(int i=1;i<=5;i++)
		{		
			for(int j=4;j>=i;j--)
			
			System.out.print(" ");

			for(int k=1;k<=2*i-1;k++)
			
			System.out.print("*");
				
			System.out.println();
		}
		System.out.println();
		//Pattern 6
				int num1=0;
				int num2=0;
				int k=0;
		for(int i=1;i<=5;i++)
		{		
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
				++num1;
			}
			while(k!=2*i-1)
			{
				if(num1<=4)
				{
					System.out.print(i+k);
					++num1;
				}
				else
				{
					++num2;
					System.out.print(i+k-2*num2);
				}
				++k;
			}
			num1=num2=k=0;
			System.out.println();
		}
		System.out.println();
	}

}