//Swapping of kth node
class Swapping
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

public void insertAfter(Node prev,int newData)
{
	if(prev==null)
	{
		System.out.println("Previous node cannot be null");
		return;
	}
	Node temp=new Node(newData);
	temp.next=prev.next;
	prev.next=temp;

}
public void print()
{
	Node n=head;
	while(n!=null)
	{
		System.out.print(n.data+" ");
		n=n.next;
	}
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

public void swapKth(int k)
{
	int n=count();
	if(k>n)
	System.out.println("k cannot be greater than no of nodes");
	
	if(2*k-1==n)
	System.out.println("Swapping nodes cannot be same");

	Node x=head;
	Node x_prev=null;
	for(int i=1;i<k;i++)
	{
		x_prev=x;
		x=x.next;
	}
	Node y=head;
	Node y_prev=null;
	for(int j=1;j<n-k+1;j++)
	{
		y_prev=y;
		y=y.next;
	}
	if(x_prev!=null)
		x_prev.next=y;

	if(y_prev!=null)
		y_prev.next=x;

	Node temp=x.next;
	x.next=y.next;
	y.next=temp;

	if(k==1)
		head=y;
	if(k==n)
		head=x;
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
	Swapping s=new Swapping();
	for(int i=8;i>=1;i--)
	{
		s.push(i);
	}
	System.out.println("Original List");
	s.print();

	for(int k=1;k<9;k++)
	{
		s.swapKth(k);
		System.out.println();
		System.out.println("Modified list for k = "+k);
		s.print();
	}

}

}