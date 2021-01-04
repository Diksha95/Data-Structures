import java.util.LinkedHashMap;
import java.util.*;
class NonRepeatingChar
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=sc.nextLine();
    Map<Character,Integer> map=new LinkedHashMap<>();
    for(char ch:str.toCharArray())
    {
            if(map.containsKey(ch))
            map.put(ch, map.get(ch)+1);
            else
            map.put(ch,1);   
    }
    boolean flag=false;
    for(Map.Entry<Character,Integer> m:map.entrySet())
    {
        if(m.getValue()==1)
        { 
            System.out.println("The first non repeating character is"+ m.getKey()); 
            flag=true;
            break;
    }
    }
}
}