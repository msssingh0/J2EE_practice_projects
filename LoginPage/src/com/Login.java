package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static Connection con;
    public Login() throws Exception {
    	Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		
		 con=DriverManager.getConnection("jdbc:mysql://localhost/user","root","singh");
		System.out.println("Connection Obtained");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 response.setContentType("text/html");
		 
		 try {
			Login l=new Login();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 String data0= request.getParameter("abc");
		 String data= request.getParameter("id");
		 String data2= request.getParameter("pass");
		 switch (data0) {
		case "Login":
			 try {
					
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select id,password from login");
					int i=0;
					while(rs.next()){
						System.out.println(rs.getString(1) + "," + rs.getString(2));
						if(rs.getString(1).equals(data)){
							if(rs.getString(2).equals(data2)){
								RequestDispatcher rd= request.getRequestDispatcher("sucsess.html");
								rd.forward(request,response);
							}
							else{
								out.println("<h2>Login Failed</h2>");
								
							//	RequestDispatcher  rd = request.getRequestDispatcher("Login.html");
							//	rd.include(request, response);
							}
						}
						//else
						//	out.println("user dont exist");
					}
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
			break;

		case "signup":
			 try {
				PreparedStatement pst=con.prepareStatement("insert into login (id,password) values (?,?)");
				
				pst.setString(1, data);
				pst.setString(2, data2);
				
				int res=pst.executeUpdate();
				
				out.println("Added data "+ res);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		 
		// if(data.equals("manish") && data2.equals("12345"))
			 
			
		
		 
	}

}
