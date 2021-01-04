import java.util.Scanner;

class SecureConversation
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation to perform");
        int opr=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the input message");
        String message=sc.nextLine();
        System.out.println("Enter the private key");
        String key=sc.nextLine();
        System.out.println("The output is :"+secureChannel(opr, message, key));

    }

    public static String secureChannel(int opr,String message,String key)
    {
        if(message.length() ==0 || key.length()==0)
         return "-1";

         String returnStr="";
         if(opr==1)
         {
             int index=0;
             for(int i=0;i<key.length();i++)
             {
                int keyVal=Integer.parseInt(key);
                if(index>=keyVal)
                   return returnStr;
               returnStr=returnStr+message.charAt(index)*keyVal;
               index=index+1;
             }
               if(index<message.length())
               {
                   returnStr=returnStr+message.charAt(index);
               }
             
         }

         if(opr==2)
         {
             int index=0;
             for(int i=0;i<key.length();i++)
             {
                int keyVal=Integer.parseInt(key);
                if(index>=keyVal)
                   return returnStr;
                for(int j=0;j<keyVal;j++)
                {
                    if((index+j)>message.length())
                        return "-1";
                    if(message.charAt(index)!=message.charAt(index+j))
                        return "-1";
                }
               returnStr=returnStr+message.charAt(index);
               index=index+keyVal;
                 }
               if(index<message.length())
               {
                   returnStr=returnStr+message.charAt(index);
               }  
         }
         else
                return "-1";

            return  returnStr;

    }
}