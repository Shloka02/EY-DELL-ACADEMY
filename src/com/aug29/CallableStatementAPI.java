package com.aug29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.CallableStatement;

public class CallableStatementAPI {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn= null;
		CallableStatement stmt= null;
		Scanner sc=new Scanner(System.in);
		
		try {
			String dbURL="jdbc:mysql://localhost:3306/hplus?user=root&password=Shloka1@";
			conn= DriverManager.getConnection(dbURL);
			if(conn!=null) {
				System.out.println("connection established using conn");
			}
		
			System.out.println("Enter employee ID");
			int id= Integer.parseInt(sc.nextLine());
			System.out.println("Enter employee name");
			String empname=sc.nextLine();
			System.out.println("Enter employee role");
			String emprole=sc.nextLine();
			System.out.println("Enter employee city");
			String empcity=sc.nextLine();
			System.out.println("Enter employee country");
			String empcountry=sc.nextLine();
			stmt=conn.prepareCall("{call insertEmployee(?,?,?,?,?,?)}");
		    stmt.setInt(1, id);
		    stmt.setString(2, empname);
		    stmt.setString(3, emprole);
		    stmt.setString(4, empcity);
		    stmt.setString(5, empcountry);
		    
		    stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
		    
		    stmt.executeUpdate();
		    String result=stmt.getString(6);
		    System.out.println("employee record save success:"+result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
				sc.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
