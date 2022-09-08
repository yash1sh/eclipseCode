package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class personn {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn;
		Scanner sc= new Scanner(System.in);
		int i,age;
		String name;
	while(true) {
		
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root", "root");
		System.out.println("Enter the id name and age");
		i=sc.nextInt();
		name=sc.next();
		age=sc.nextInt();
		if(name.equals("exit"))
			break;
		PreparedStatement p= conn.prepareStatement("Insert into person(id,name,age) values(?,?,?)");
		p.setInt(1, i);
		p.setString(2, name);
		p.setInt(3, age);
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

