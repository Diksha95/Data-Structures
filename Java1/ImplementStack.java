//Implement stack using single queue
import java.util.LinkedList;
import java.util.Queue;
class ImplementStack
{
	static Queue<Integer> q1=new LinkedList<>();

	static void push(int x)
	{
		q1.add(x);
		int sz=q1.size();
		while(sz>1)
		{
			q1.add(q1.remove());
			sz--;
		}
	}
	static int pop()
	{
		return q1.remove();
	}
	static int peek()
	{
		return q1.peek();
	}
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++)
		{
			push(i);
		}
		System.out.println("Elements of queue are");
		while(!q1.isEmpty())
		{
			System.out.print(pop()+" ");
		}
		//System.out.println("Top element of queue is "+peek());
	}
}