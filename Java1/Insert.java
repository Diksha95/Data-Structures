class Insert
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

	public void sortInsert(Node n)
	{
			Node current=head;
			if(head==null || head.data >=n.data)
			{
				n.next=head;
				head=n;
			}
			else{
			while(current.next!=null && current.next.data < n.data)
			{
				current=current.next;
			}
			n.next=current.next;
			current=n;
		}
	}
	public Node newNode(int new_data)
	{
		Node x=new Node(new_data);
		return x;
	}
	public void insertAfter(Node prev_node,int new_data)
	{
		if(prev_node==null)
		{
			 System.out.println("The given previous node cannot be null");
            return;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	public void deletenode(Node n)
	{
		Node temp;
		n.data=n.next.data;
		temp=n.next;
		n.next=temp.next;
	}
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.data=new_data;
		new_node.next=head;
		head=new_node;
	}
	public static void main(String...abc)
	{
		Insert i=new Insert();
		Node new_node;
		new_node=i.newNode(9);
		i.sortInsert(new_node);
		new_node=i.newNode(8);
		i.sortInsert(new_node);
		Node x=i.newNode(7);
		i.sortInsert(x);
		new_node=i.newNode(6);
		i.sortInsert(new_node);
		i.deletenode(x);
		i.printList();
	}

}