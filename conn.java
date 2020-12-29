package hotel.management.system;

import java.sql.*;

public class conn {
	
	Connection c;
	Statement s;
	
	public conn() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:8889/projecthms","root","root");
			s=c.createStatement();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
