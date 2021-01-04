import java.util.Scanner;
import java.sql.*;
class Auth
{
	public static void main(String arr[])
	{	
		try{
			int ch;String username,pass;char c;
		String uname,pin,city,en;
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","myorder","1234");
		do{
			System.out.println("Press 1 for Login and 2 for Register");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		sc.nextLine();
		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter your username");
				username=sc.nextLine();
				System.out.println("Enter your password");
				pass=sc.nextLine();
				PreparedStatement ps1=cn.prepareStatement("select * from authentication where username=? and password=?");
				ps1.setString(1,username);
				ps1.setString(2,pass);
				ResultSet rs1=ps1.executeQuery();
				if(rs1.next())
				{
				System.out.println("Login Successfully");
				do{
				System.out.println("Do you want to change password or see all users");
				System.out.println("Press 1 for update password and 2 for see all users");
				int choice=sc.nextInt();
				sc.nextLine();
					if(choice==1)
				{
					System.out.println("Enter your new password");
					String pws=sc.nextLine();
					PreparedStatement ps2=cn.prepareStatement("update authentication set password=? where username=?");
					ps2.setString(1,pws);
					ps2.setString(2,username);
					int i=ps2.executeUpdate();
					if(i>0)
					System.out.println("Password Successfully Changed");
				}
				else if(choice==2){
					PreparedStatement ps3=cn.prepareStatement("select * from authentication");
					ResultSet rs3=ps3.executeQuery();
					while(rs3.next())
					{
						String un=rs3.getString("username");
						String pn=rs3.getString("password");
						String cy=rs3.getString("city");
						System.out.println(un+":"+pn+":"+cy);
					}
				}
				else
					{System.out.println("Wrong choice entered");} 
					System.out.println("Do you want to continue press y for yes and n for no");
					c=sc.next().charAt(0);
					sc.nextLine();
				}while(c=='y'|| c=='Y');
			}
			else
			{
				System.out.println("Login Failed");
			}
				}
				break;
				case 2:
				{
					System.out.println("Enter your username");
					uname=sc.nextLine();
					System.out.println("Enter your password");
					pin=sc.nextLine();
					System.out.println("Enter your city");
					city=sc.nextLine();
					PreparedStatement ps4=cn.prepareStatement("insert into authentication values(?,?,?)");
					ps4.setString(1,uname);
					ps4.setString(2,pin);
					ps4.setString(3,city);
					int i=ps4.executeUpdate();
					if(i>0)
					System.out.println("done");
				}
				break;

				default:System.out.println("Wrong choice entered");
		}
				System.out.println("Do you want to again Register or Login? Press exit for termination");
				en=sc.nextLine();
				}while(!en.equals("exit"));
				}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}