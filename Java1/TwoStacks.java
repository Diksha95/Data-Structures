class TwoStacks
{
	static int arr[];
	static int size;
	static int top1,top2;
	TwoStacks(int n)
	{
		size=n;
		arr=new int[n];
		top1=-1;
		top2=size;
	}
	static void push1(int x)
	{
		if(top1<top2-1)
		{
			arr[++top1]=x;
			System.out.println(x+" is pushed to the stack");
		}
		else{
			System.out.println("Stack Overflow");
			System.exit(0);
		}
	}

	static void push2(int x)
	{
		if(top1<top2-1)
		{
			arr[--top2]=x;
			System.out.println(x+" is pushed to the stack");
		}
		else{
			System.out.println("Stack Overflow");
			System.exit(0);
		}
	}
	static int pop1()
	{
		if(top1>=0)
		{
			int x=arr[top1];
			top1--;
			return x;
		}
		else
		{
			System.out.println("Stack Underflow");
			System.exit(0);
		}
		return 0;
	}
	static int pop2()
	{
		if(top2<size)
		{
			int x=arr[top2];
			top2++;
			return x;
		}
		else
		{
			System.out.println("Stack Underflow");
			System.exit(0);
		}
		return 0;
	}

	public static void main(String...abc)
	{
		TwoStacks ts=new TwoStacks(5);
		push1(5);
		push1(6);
		push2(10);
		push2(9);
		push1(7);
		System.out.println(pop1()+" is popped from stack");
		System.out.println(pop2()+" is popped from stack");
			
	}
}