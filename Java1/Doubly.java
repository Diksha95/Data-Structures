class Doubly
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
	{
		data=d;
		next=null;
		prev=null;
	}
		}

public void push(int newData)
{
	Node n=new Node(newData);
	n.prev=null;
	n.next=head;
	if(head!=null)
		head.prev=n;
	head=n;
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
public void insertAfter(Node n,int newData)
{
	Node temp=new Node(newData);
	if(n==null)
		System.out.println("previous node cannot be null");
	temp.next=n.next;
	n.next=temp;
	temp.prev=n;
	if(temp.next!=null)
	{
		temp.prev.next=temp;
	}
	
}
void reverse()
{
	Node temp=null;
	Node current=head;
	while(current !=null)
	{
		temp=current.prev;
		current.prev=current.next;
		current.next=temp;
		current=current.prev;
	}
	if(temp!=null)
		head=temp.prev;

}
public static void main(String...abc)
{
	Doubly d=new Doubly();
	d.head=new Node(3);
	d.push(2);
	d.push(1);
	d.push(0);
	d.insertAfter(d.head.next,4);
	d.reverse();
	d.print();
}
}