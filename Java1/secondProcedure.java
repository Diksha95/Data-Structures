import java.sql.*;
class secondProcedure
{

	public static void main(String arr[])
	{
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","myorder","1234");
	CallableStatement cst=cn.prepareCall("{call savedata(?,?,?)}");
	cst.setString(1,"tom");
	cst.setString(2,"1234");
	cst.setString(3,"new york");
	int i=cst.executeUpdate();
	if(i>0)
	System.out.println("done"); 
	cst.close();
	cn.close();
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}