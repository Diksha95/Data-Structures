class Pascal
{
	public static void main(String[] args) {
		int c=1;
		for(int i=0;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				if(i==0|| k==0)
					c=1;
				else
				c=c*(i-k+1)/k;
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	
}