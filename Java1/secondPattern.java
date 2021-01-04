class secondPattern
{
	public static void main(String arr[])
	{	
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			
				System.out.print(" ");

			for(int k=1;k<=2*i-1;k++)
					if(k<= i)
			System.out.print((char)(char)(k+64)+""); //for printing values
					else
			System.out.print((char)(char)(2*i-k+64)+"");

			System.out.println();

		}
	}
}