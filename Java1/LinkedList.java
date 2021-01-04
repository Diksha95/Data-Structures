class LinkedList
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
	public void insertAfter(Node prev_node,int new_data)
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
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		Node last=head;
		new_node.next=null;
		if(head==null)
		{
			head=new Node(new_data);
		}
		while(last.next!=null)
		
			last=last.next;
		
		last.next=new_node;
		return;
	}
	public void deleteNode(int key)
	{
		Node temp=head,prev=null;
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		prev.next=temp.next;

	}
	public void deletePos(int position)
	{
		Node temp=head;

		if(head==null)
			return;
		if(position==0)
		{
			head=temp.next;
		}
		for(int i=0;temp!=null && i<position-1;i++)
		{
			temp=temp.next;
		}
		if(temp==null || temp.next==null)
			return;
		Node next=temp.next.next;
		temp.next=next;
	}
	public int count()
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
	public boolean search(int key)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==key)
				return true;
			temp=temp.next;
		}
		return false;
	}
	public void swapNodes(int x,int y)
	{
		Node prevX=null,currX=head;
		if(x==y)
			return;
		while(currX!=null && currX.data!=x)
		{
			prevX=currX;
			currX=currX.next;
		}
		Node prevY=null,currY=head;
		while(currY!=null && currY.data!=y)
		{
			prevY=currY;
			currY=currY.next;
		}
		if(currY==null || currX==null)
			return;
		if(prevX!=null)
			prevX.next=currY;
		else
			head=currY;
		if(prevY!=null)
			prevY.next=currX;
		else
			head=currX;
		Node temp=currY.next;
		currY.next=currX.next;
		currX.next=temp;
	}
	int getNode(int pos)
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			if(count==pos)
				return temp.data;
				count++;
				temp=temp.next;
		}
		return 0;
	}

	public void printMi()
	{
		Node slow=head;
		Node fast=head;
		if(head!=null)
		{
			while(fast!=null && fast.next!=null)
			{
				fast=fast.next.next;
				slow=slow.next;
			}
			System.out.println("The value of middle element is "+slow.data);
		}
	}

	public void printMid()
	{
		int count=0;
		Node mid=head;
		while(head!=null)
		{
			if(count%2==1)
			mid=mid.next;
		++count;
		head=head.next; }
		if(mid!=null)
			System.out.println("The value of middle element is "+mid.data);
		
	}

	public void deleteList()
	{
		head=null;
	}
	public void getNTimes(int key)
	{	
		int c=0;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==key)
				c++;
			temp=temp.next;
		}
		System.out.println("No of times "+key+" occured is "+c);
	}

	public void reverse()
	{
		Node current=head;
		Node prev=null;
		Node next;
		while(current != null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}	
		head=prev;
	}

	public static void main(String...abc)
	{
		LinkedList list=new LinkedList();

		list.head=new Node(1);
		Node second=new Node(30);
		Node third=new Node(30);

		list.head.next=second;

		second.next=third;

		list.push(30);
		list.insertAfter(list.head.next,50);
		list.append(60);
		System.out.println("List Created");
		/*list.printList();
		list.count();*/
		//list.deleteNode(50);
		// list.deletePos(2);
		// System.out.println("List after deletion of 50");
		// list.printList();
		// list.count();
		// boolean t=list.search(-1);
		// System.out.println(t);
		/*list.swapNodes(30,50);
		list.printList();
		int i=list.getNode(4);
		System.out.println("Value at is "+i);*/
		/*list.printMi();
		list.deleteList();
		System.out.println("List is deleted");
		list.printList();*/
		//list.getNTimes(30);
		list.reverse();
		list.printList();
	}
}