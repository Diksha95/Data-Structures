//Split method
import java.lang.String;
class SplitEg
{
	public static void main(String[] args) {
		String s=new String("Diksha Sharma is a btech student");
		String []ch=s.split("\\s");
		for(String w:ch)
		{
			System.out.print(w);
		}
	}
}