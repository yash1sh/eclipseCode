package example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class deleteDetails {
public static void main(String[] args) {
	Connection conn;
	Scanner sc= new Scanner(System.in);
	String name;
while(true) {
	
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root", "root");
	System.out.println("Enter the name to delete");
	name=sc.next();
	if(name.equals("exit"))
		break;
	PreparedStatement p= conn.prepareStatement("Delete from person where name=?");

	p.setString(1, name);
	p.execute();
	
	
}
	catch(Exception e)
	{
	e.printStackTrace();
	}

}
sc.close();
}
}
