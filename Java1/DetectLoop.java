import java.util.*;
class DetectLoop
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

	static void push(int new_data)
	{
		Node n=new Node(new_data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}

	static void printList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	static int count()
	{	
		int c=0;
		Node n=head;
		while(n!=null)
		{
			n=n.next;
			c++;
		}
		return c;

	}
	static boolean Loop()
	{
		HashMap<Node,Integer> hs=new HashMap<>();
		Node p=head;
		while(p.next!=null)
		{
			if(hs.containsKey(p.next))
			{
				return true;
			}
			else
			{
				hs.put(p.next,p.data);
			}
			p=p.next;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		head=new Node(60);
		push(50);
		push(40);
		push(30);
		push(20);
		push(10);
		System.out.print("The linked is : ");
		printList();
		System.out.println();
		head.next.next.next=head;
		boolean b=Loop();
		if(b)
			System.out.println("Loop Found");
		else
			System.out.println("No Loop Found");
	}
}