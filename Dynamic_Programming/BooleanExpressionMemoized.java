import java.util.*;
class BooleanExpressionMemoized
{		
	static int tTrue[][]=new int[501][501];
	static int tFalse[][]=new int[501][501];
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the string");
		String s=sc.next();
		for(int m=0;m<=n;m++)
		for(int p=0;p<=n;p++){
			tTrue[m][p]=-1;
			tFalse[m][p]=-1;
		}
		System.out.println("No of ways in which function can be evaluated to True are : " + booleanExpression(s,0,n-1,true));
		sc.close();
	}

	public static int booleanExpression(String s,int i,int j,boolean isTrue){
	
	
		if(i>j)
			return 0;
		if(i==j) {   // For only one element in the String
			if(isTrue == true && s.charAt(i) == 'T')
				return 1;
	        else if(isTrue == false && s.charAt(i) == 'F')
	        	return 1;
	        else if(isTrue == true && s.charAt(i) == 'F')
	        	return 0;
	        else if(isTrue == false && s.charAt(i) == 'T')
	        	return 0;
		}  

	

		if(isTrue == true && tTrue[i][j]!=-1)
			return tTrue[i][j];
		else if(isTrue == false && tFalse[i][j]!=-1)
			return tFalse[i][j];

		int result=0;
		for(int k=i+1;k<j;k=k+2) {
			int lT=booleanExpression(s,i,k-1,true);
			int lF=booleanExpression(s,i,k-1,false);
			int rT=booleanExpression(s,k+1,j,true);
			int rF=booleanExpression(s,k+1,j,false);

			if(s.charAt(k)=='&') {
				if(isTrue==true)
					result=result + (lT*rT);
				else
					result=result+(lF*rT) + (lF*rF) + (rF*lT);

			}
			else if (s.charAt(k)=='|') {
				if(isTrue==true)
					result=result+(lT*rT) + (lT*rF) + (rT*lF);
				else
					result=result + (rF*lF);
			}
			else if (s.charAt(k)=='^') {
				if(isTrue==true)
					result=result+(lT*rF) + (lF*rT);
				else
					result=result+(lT*rT) + (lF*rF);
			}

			tTrue[i][k-1]=lT;
			tFalse[i][k-1]=lF;
			tTrue[k+1][j]=rT;	
			tFalse[k+1][j]=rF;
		}

		return result%1003;
	}
	}
