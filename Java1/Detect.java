import java.util.HashSet;
class Detect
{
	Node head;
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

	public void printList()
	{
		Node n=head;
		if(n==null)
			System.out.println("Empty List");
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}

	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.data=new_data;
		new_node.next=head;
		head=new_node;
	}

	/*boolean hasLoop(Node head)
	{
		Node p=head;
		HashSet<Node> hs=new HashSet<Node>();
		if(head==null || head.next==null)
			return false;
		while(p.next!=null)
		{
			if(hs.contains(p))
			return true;
			else
				hs.add(p);
			p=p.next;
		}
		return false;
	}
*/
/*public void insertAfter(Node prev_node,int new_data)
	{
		if(prev_node==null)
		{
			System.out.println("Previous node cannot be null");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}

*/
	public static Node merge(Node p1,Node p2)
	{
		Node head=new Node(0);
		Node p3=head;
		while(p1!=null || p2!=null)
		{
			if(p1!=null && p2!=null)
			{
				if(p1.data<p2.data)
				{	p3.next=p1;
					p1=p1.next;
				}
			else
			{	p3.next=p2;
				p2=p2.next;
			}
			p3=p3.next;
		}
		else if(p1==null)
		{	p3.next=p2;
			break;
		}
		else
		{
			p3.next=p1;
			break;
		}
		}
		return head.next;
	}
public static void main(String...abc)
	{
		Detect list=new Detect();
		Detect list2=new Detect();
		Detect list3=new Detect();

		list.head=new Node(50);
		list.push(40);
		list.push(30);
		list.push(20);
		list.push(10);
		System.out.println("First List");
		list.printList();
		/*list.head.next.next.next=list.head;
		boolean b=list.hasLoop(list.head);
		if(b)
		{
			System.out.println("Loop found");
		}
		else
			System.out.println("Not found");*/
		list2.head=new Node(100);
		list2.push(90);
		list2.push(80);
		list2.push(70);
		list2.push(60);
		System.out.println("Second List");
		list2.printList();
		list3.head=merge(list.head,list2.head);
		System.out.println("The mergeList is ");
		list3.printList();

}


}