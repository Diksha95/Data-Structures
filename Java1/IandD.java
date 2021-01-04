import java.util.Scanner;
import java.util.Stack;
import java.util.Stack; 

// Java program to print minimum number that can be formed 
// from a given sequence of Is and Ds 
class IandD { 

// Function to decode the given sequence to construct 
// minimum number without repeated digits 
	static void PrintMinNumberForPattern(String seq) { 
		// result store output string 
		String result = ""; 

		// create an empty stack of integers 
		Stack<Integer> stk = new Stack<Integer>(); 

		// run n+1 times where n is length of input sequence 
		for (int i = 0; i <= seq.length(); i++) { 
			// push number i+1 into the stack 
			stk.push(i + 1); 

			// if all characters of the input sequence are 
			// processed or current character is 'I' 
			// (increasing) 
			if (i == seq.length() || seq.charAt(i) == 'I') { 
				// run till stack is empty 
				while (!stk.empty()) { 
					// remove top element from the stack and 
					// add it to solution 
					result += String.valueOf(stk.peek()); 
					result += " "; 
					stk.pop(); 
				} 
			} 
		} 

		System.out.println(result); 
	} 

// main function 
	public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ip string");
        String input =sc.nextLine();
        PrintMinNumberForPattern(input);
	} 
} 
// This code is contributed by PrinciRaj1992 
