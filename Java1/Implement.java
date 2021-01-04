import java.util.Stack;
import java.util.ListIterator;
class Implement
{
	static Stack<Integer> s1=new Stack();
	static Stack<Integer> s2=new Stack();

	static void enqueue(int x)
	{
		s1.push(x);
	}
	static int dequeue()
	{
		if(s1.isEmpty() && s2.isEmpty())
		{
			System.out.println("Both queues cannot be empty");
			return 0;
		}
		else
		{
			if(s2.isEmpty())
			{
				while(!s1.isEmpty())
				{
					int temp=s1.pop();
					s2.push(temp);
				}
			}
			int x=s2.pop();
			return x;
		}
	}
	static int  top()
	{
		return s2.peek();
	}
	// static void print()
	// {
	// 	while(!s2.isEmpty()) {
	// 		int temp=s2.pop();
	// 		System.out.print(temp+" ");
	// 	}
	// }
	public static void main(String[] args) {
		for(int i=1;i<10;i++)
		{
			enqueue(i);
		}
		System.out.println("Items in queue");
		for(int i=1;i<7;i++)
		{
		System.out.print(dequeue()+" ");
		}
		System.out.println();
		System.out.println("Top element of queue is "+top());
	}

}