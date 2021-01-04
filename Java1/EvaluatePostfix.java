import java.util.Stack;
import java.lang.Math;
class EvaluatePostfix
{
	static int ev(String s)
	{
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
				char c=s.charAt(i);
				if(Character.isDigit(c))
					stack.push(c-'0');
				else
				{
					int val1=stack.pop();
					int val2=stack.pop();
					switch(c)
					{
						case '+': stack.push(val2+val1); break;
						case '-': stack.push(val2-val1); break;
						case '/': stack.push(val2/val1); break;
						case '*': stack.push(val2*val1); break;
						case '^': stack.push((int)Math.pow(val2,val1)); break;
					}
				}
		}
			return stack.pop();
	}
	static String reverse(String s)
	{
		Stack<Character>stack=new Stack<>();
		String res="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			stack.push(c);
		}
		while(!stack.isEmpty())
		{
			res+=stack.pop();
		}
		return res;
	}
	public static void main(String...abc)
	{
		/*String exp="231*+9-";*/
		String exp="GeeksQuiz";
		System.out.println(reverse(exp));
	}
}