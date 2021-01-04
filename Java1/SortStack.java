import java.util.Stack;
import java.util.ListIterator;
class SortStack
{
	static void sortInsert(Stack s,int x)
	{
		if(s.isEmpty() || x > (int)s.peek())
		{
			s.push(x);
			return;
		}
		else
		{
			int temp=(int)s.pop();
			sortInsert(s,x);
			s.push(temp);
		}
	}
	static void sortStack(Stack s)
	{
		if(!s.isEmpty())
		{
			int temp=(int)s.pop();
			sortStack(s);
			sortInsert(s,temp);
		}
	}

	static void printStack(Stack s) {
		ListIterator<Integer> it = s.listIterator();
		while(it.hasNext())
		{
			it.next();
		}
		while(it.hasPrevious())
		{
			System.out.print(it.previous()+" ");
		}
	}
	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
        System.out.println("Stack before Sorting");
        printStack(s);
        System.out.println();
        System.out.println("Stack after Sorting");
        sortStack(s);
        printStack(s);
	}
}