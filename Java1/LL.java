class LL
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

	static void push(int newData)
	{
		Node n=new Node(newData);
		if(head==null)
			n.next=null;
		else
			n.next=head;
			head=n;
	}
	static void deleteList()
	{
		head=null;
	}
	static void printList()
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String[] args) {
		
		head=new Node(5);
		push(4);
		printList();
		System.out.println("\nDeleting list");
		deleteList();
		System.out.println("List deleted");
	}
}