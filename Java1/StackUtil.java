/*import java.util.Stack;
class StackUtil
{
	static int Prec(char c)
	{
		switch(c)
		{
			case '+':
			case '-':
			return 1;
			case '/':
			case '*':
			return 2;
			case '^':
			return 3;
		}
		return -1;
	}
	static String infixtoPostfix(String exp)
	{
		Stack<Character> st=new Stack<>();
		String ns=new String("");
		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
			if(Character.isLetterOrDigit(c))
				ns+=c;
			else if(c=='(')
				st.push(c);
			else if(c==')')
			{
				while(!st.isEmpty() && st.peek()!='(')
				{
					ns+=st.pop();
				}
				if(!st.isEmpty() && st.peek()!='(')
					return "Invalid Expression";
				else
					st.pop();
			}
			else
			{
				while(!st.isEmpty() && Prec(c)<=Prec(st.peek()))
				{
					ns+=st.pop();
					st.push(c);
				}

			}

		}
		while(!st.isEmpty())
		{
			ns+=st.pop();
		}
		return ns;
	}
	public static void main(String...abc)
	{
		String exp="a+b(c^d-e)^(f+g*h)-i";
		System.out.println(infixtoPostfix(exp));
	}
}*/
/* Java implementation to convert infix expression to postfix*/
// Note that here we use Stack class for Stack operations
 
import java.util.Stack;
 
class StackUtil
{
    // A utility function to return precedence of a given operator
    // Higher returned value means higher precedence
    static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
      
    // The main method that converts given infix expression
    // to postfix expression. 
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");
         
        // initializing empty stack
        Stack<Character> stack = new Stack<>();
         
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
             
             // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
              
            // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);
             
            //  If the scanned character is an ')', pop and output from the stack 
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                 
                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression                
                else
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
      
        }
      
        // pop all the operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();
      
        return result;
    }
   
    // Driver method 
    public static void main(String[] args) 
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}