/* Complexity of this code is O(n) */
import java.util.*;
public class DeleteMiddleOfStack{

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
	st.push(5);
	
	int middle=0;
	if(st.size()%2==0){
		middle=st.size()/2;
	}else{
		middle=st.size()/2+1;
	}
	st=sortedStack(st,middle);
	st.stream().forEach(System.out::println);
  }

  private static Stack<Integer> sortedStack(Stack<Integer> st,int k) {
	  
    if (st.size() == 0) {
      return st;
    }
	if(k==1){
		st.pop();
		return st;
	}
    Integer topEl = st.pop();
    // Hypotheses
    sortedStack(st,k-1);
    // Induction
    st.push(topEl);
    return st;
  }
}