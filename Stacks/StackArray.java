/* Implemetation of Stack Using Array 
Disadv : Cant grow or shrink depending on size
*/
class StackArray{

	public static final int CAPACITY = 10;
	static int top;
	static int stackArr[] = new int [CAPACITY];
	
	public StackArray(){
		this.top = -1;
	}
	
	//Returns the size of the stack O(1)
	public static int stackSize(){
	
		return top+1;
	
	}
	
	//Return whether stack is Empty O(1)
	public static boolean isEmpty(){
	
		return (top < 0);
	}
	
	//Return whether stack is Full O(1)
	public static boolean isFull(){
	
		return (top == CAPACITY);
	}
	//O(1)
	public static int pop(){  
	
		if(isEmpty()){
			System.out.println("Stack is Empty");
			System.exit(0);
		}
		
		int element = stackArr [top--];
		return element;
	}
	//O(1)
	public static void push(int item){
	
		if(isFull()){
			System.out.println("Stack is Full");
		}
		
		stackArr[++top] = item;
	}
	
	public static void main(String args[]){
	
		push(1);
		push(2);
		push(3);
		//O(n) n:size of the array 
		for(int i = 0; i<= stackArr.length - 1;i++){
			System.out.println(pop());
		}
	}
}