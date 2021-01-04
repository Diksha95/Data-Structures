import java.sql.*;
class Procedure
{
	public static void main(String arr[])
	{
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","myorder","1234");
	CallableStatement cst=cn.prepareCall("{call getdata()}");
	ResultSet rs=cst.executeQuery();
	while(rs.next())
	{
	String u=rs.getString("username");
	String p=rs.getString("password");
	System.out.println(u+":"+p); }
	rs.close();
	cst.close();
	cn.close();
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}