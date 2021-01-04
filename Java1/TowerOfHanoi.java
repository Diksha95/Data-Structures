import java.util.Stack;
import java.lang.Math;
class TowerOfHanoi
{
	static void moveDisk(char fromPeg,char toPeg, int disk)
	{
		System.out.println("Move the disk "+disk+" from "+fromPeg+" to "+toPeg);
	}
	static void moveBetweenTwoPoles(Stack<Integer>src,Stack<Integer>des,char s,char d)
	{
			if(src.isEmpty())
			{
				int desTop=des.pop();
				src.push(desTop);
				moveDisk(d,s,desTop);
			}
			else if(des.isEmpty())
			{
				int srcTop=src.pop();
				des.push(srcTop);
				moveDisk(s,d,srcTop);
			}
			else if(src.peek()<des.peek())
			{
				int srcTop=src.pop();
				des.push(srcTop);
				moveDisk(s,d,srcTop);
			}
			else if(src.peek()>des.peek())
			{
				int desTop=des.pop();
				src.push(desTop);
				moveDisk(d,s,desTop);
			}
	}
	static void tohIterative(int no_of_disks,Stack<Integer> src,Stack<Integer> des,Stack<Integer> aux)
	{
		int total_moves=(int)Math.pow(2,no_of_disks)-1;
		char s='S';
		char d='D';
		char a='A';
		if(no_of_disks%2==0)
		{
			char temp=a;
			a=d;
			d=temp;
		}
		for(int i=no_of_disks;i>=1;i--)
		{
			src.push(i);
		}
		for(int i=1;i<=total_moves;i++)
		{
			if(i%3==1)
			moveBetweenTwoPoles(src,des,s,d);
			else if(i%3==2)
			moveBetweenTwoPoles(src,aux,s,a);
			else if(i%3==0)
			moveBetweenTwoPoles(aux,des,a,d);
		}

	}
	public static void main(String[] args) {
		int no=3;
		Stack<Integer> src = new Stack<>();
		Stack<Integer> des = new Stack<>();
		Stack<Integer> aux= new Stack<>();
		tohIterative(no,src,des,aux);
	}
}