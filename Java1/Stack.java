class Stack
{
	int top;
	static final int MAX=100;
	int []a=new int[MAX];
	Stack()
	{
		top=-1;
	}
	boolean isEmpty()
	{
		return (top<0);
	}
	boolean push(int x)
	{
		if(top>=MAX-1)
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			a[++top]=x;
			System.out.println(x+" is inserted to the stack");
			return true;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x=a[top--];
			return x;
		}
	}
	int peek()
	{
		return a[top];
	}


	
	public static void main(String...abc)
	{
		Stack s=new Stack();
		System.out.println("Push Operation");
		for(int i=1;i<8;i++)
		{
			s.push(i);
			System.out.println();
		}
		System.out.println();
		System.out.println("Pop Operation");
		/*for(int i=s.top;i>-1;i--)
		{*/
			System.out.println(s.pop()+" is popped from the stack");
			System.out.println();
		/*}*/
		System.out.println("Top element of the stack is "+s.peek());

	}

}