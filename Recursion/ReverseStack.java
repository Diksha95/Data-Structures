import java.util.Stack;
class ReverseStack{
	public static void main(String args[]){
	
	Stack<Integer> stack=new Stack<Integer>();
	stack.push(5);
	stack.push(4);
	stack.push(3);
	stack.push(2);
	stack.push(1);
	
	System.out.println("Stack Before");
	stack.stream().forEach(System.out::print);
	System.out.println();
	System.out.println("Stack After");
	stack=reverseStack(stack);
	stack.stream().forEach(System.out::print);
	}

	public static Stack<Integer> reverseStack(Stack<Integer>s){
	
		if(s.size()==1)
			return s;
		
		Integer temp=s.pop();
		reverseStack(s);
		insert(s,temp);
		return s;
	}
	public static Stack<Integer> insert(Stack<Integer> st,int temp){
		if(st.size()==0){
			st.push(temp);
			return st;
		}
		Integer val=st.pop();
		insert(st,temp); //Function is called for smaller input with element present at the top removed
		st.push(val);
		return st;
		
	}
}