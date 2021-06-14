import java.util.*;
class OpenGate{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<T;i++){
            String s = sc.nextLine();
            ArrayList<String> arr = allAnagrams(s);
            Collections.sort(arr);
            for(String str : arr){
                System.out.print(str+" ");
            }
            System.out.println();
        }
       
    }
    
    public static ArrayList<String> allAnagrams(String str) {
        if (str.length()==0){
            ArrayList<String> baseResult= new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char ch = str.charAt(0);
        String rest = str.substring(1);
        ArrayList<String> recResult = allAnagrams(rest);
        ArrayList<String> myResult = new ArrayList<>();
        for (int i = 0; i < recResult.size(); i++) {
            String s = recResult.get(i);
            for (int j = 0; j <= s.length(); j++) {
                String newString = s.substring(0, j) + ch + s.substring(j);
                myResult.add(newString);
            }
        }
        return myResult;
    }
}