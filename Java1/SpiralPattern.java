/*spiral pattern
1   2  3 4 	5
16 17 18 19 6
15 24 25 20	7
14 23 22 21	8
13 12 11 10 9
*/
import java.util.*;
class SpiralPattern
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int minRow,maxRow,minCol,maxCol,value;
		minRow=0;
		maxRow=n-1;
		minCol=0;
		maxCol=n-1;
		value=1;
		while(value<=n*n)
		{
			for(int i=minCol;i<=maxCol;i++)
			{
				arr[minRow][i]=value;
				value++;
			}
			for(int j=minRow+1;j<=maxRow;j++)
			{
				arr[j][maxCol]=value;
				value++;
			}
			for(int i=maxCol-1;i>=minCol;i--)
			{
				arr[maxRow][i]=value;
				value++;
			}
			for(int j=maxRow-1;j>=minRow+1;j--)
			{
				arr[j][minCol]=value;
				value++;
			}
			minRow++;
			minCol++;
			maxRow--;
			maxCol--;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}