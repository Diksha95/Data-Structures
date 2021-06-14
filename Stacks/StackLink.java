class StackLink{

	StackNode top;
    class StackNode{
		int data;
		StackNode next;
		
		public StackNode(int d){
			this.data = d;
			this.next = null;
		
		}
	}
	//Deleting from the head node
	public int pop()throws Exception{
	
		if(top ==null){
			throw new Exception("Cant pop from empty Stack");
		}
		
		int res = top.data;
		top = top.next;
		return res;
	}
	//Inserting at the head node
	public void push(int item){
	
		StackNode p = new StackNode(item);
		p.next = top;
		top = p;
	}
	
	public int peek() throws Exception{
	
		if(top == null){
			throw new Exception("Cant pop from empty Stack");
		}
		
		return top.data;
	}
	
	public void display() throws Exception{
	
		if(top==null){
			throw new Exception("Underflow");
		}
		else{
			StackNode temp = top;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public static void main(String args[]) throws Exception{
	
		StackLink stack = new StackLink();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.display();
		
	}
}