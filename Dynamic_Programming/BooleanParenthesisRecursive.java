/**
 * Given a boolean expression with following symbols.
Symbols
    'T' --- true
    'F' --- false
And following operators filled between symbols
Operators
    &   ---boolean AND
    |   --- boolean OR
    ^   --- boolean XOR
Count the number of ways we can parenthesize the expression so that the value of expression evaluates to true.
Example:
Input: symbol[]    = {T, F, T}
       operator[]  = {^, &}
Output: 2
The given expression is "T ^ F & T", it evaluates true
in two ways "((T ^ F) & T)" and "(T ^ (F & T))"
 */

/**
 * https://www.geeksforgeeks.org/boolean-parenthesization-problem-dp-37/
 *
 */
public class BooleanParenthesisRecursive {

	public static void main(String[] args) {

		String s="T|T&F^T";
		System.out.println(booleanExpression(s,0,s.length()-1,true));
	}

	static int booleanExpression(String s,int i,int j,boolean isTrue){

		//String temp=(i+" "+j+" "+isTrue);
		int lT,lF,rT,rF;
		int result=0;
		if(i>j)
			return 0;
		else if(i==j) {   // For only one element in the String
			if(isTrue == true && s.charAt(i) == 'T')
				return 1;
	        else if(isTrue == false && s.charAt(i) == 'F')
	        	return 1;
	        else if(isTrue == true && s.charAt(i) == 'F')
	        	return 0;
	        else if(isTrue == false && s.charAt(i) == 'T')
	        	return 0;
		}


		for(int k=i+1;k<j;k=k+2) {
			lT=booleanExpression(s,i,k-1,true);
			lF=booleanExpression(s,i,k-1,false);
			rT=booleanExpression(s,k+1,j,true);
			rF=booleanExpression(s,k+1,j,false);

			if(s.charAt(k)=='&') {
				if(isTrue==true)
					result=result+lT*rT;
				else
					result=result+(lF*rT) + (lF*rF) + (rF*lT);

			}
			else if (s.charAt(k)=='|') {
				if(isTrue==true)
					result=result+(lT*rT) + (lT*rF) + (rT*lF);
				else
					result=result+rF*lF;
			}
			else if (s.charAt(k)=='^') {
				if(isTrue==true)
					result=result+(lT*rF) + (lF*rT);
				else
					result=result+(lT*rT) + (lF*rF);
			}
		}

		return result;
	}

}
