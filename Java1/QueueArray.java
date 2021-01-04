
class QueueArray
{	static int MAX=10;
	static int arr[];
	static int front,rear;
	QueueArray()
	{
		arr=new int[MAX];
		front=rear=-1;
	}
	static boolean isEmpty()
	{
		return (front==-1 && rear==-1);
	}
	static boolean isFull()
	{
		return (rear+1)%MAX==front;
	}
	static void Enqeue(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is full.Overflow Condition!");
			return;
		}
		else if(isEmpty())
		{
			front=rear=0;
		}
		else
		{
			rear=(rear+1)%MAX;
		}
		arr[rear]=x;
	}
	static int Dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Cannot dequeue from an empty queue");
			return 0;
		}
		else
		{
			int data=arr[front];
		 if(front==rear) //If only one element exists in the queue
		{
			front=rear=-1;
		}
		else
		{
			front=(front+1)%MAX;
		}
		return data;
	}

	}
	static int Front()
	{
		if(front==-1)
		{
			System.out.println("Element cannot be returned from empty queue");
		return 0;
	}
		else{
			return arr[front];
		}
	}
	static int QueueSize()
	{
		return (rear+MAX-front+1)%MAX;
	}
	static void printQueue()
	{
		int count=QueueSize();
		System.out.print("Queue: ");
		for(int i=0;i<count;i++)
		{
			int index=(front+i)%MAX;
			System.out.print(arr[index]+" ");
		}
	}
	public static void main(String[] args) {
		QueueArray q=new QueueArray();
		q.Enqeue(20);
		q.Enqeue(30);
		q.Enqeue(40);
		q.Enqeue(50);
		q.Enqeue(60);
		q.printQueue();
		System.out.println();
		System.out.println("Element removed from the queue is "+Dequeue());
		System.out.println("Front element of the queue is "+Front());
	}
}