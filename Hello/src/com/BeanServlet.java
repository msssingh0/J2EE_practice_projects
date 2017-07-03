package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BeanServlet")
public class BeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		Employee e=new Employee();
		e.setId(Integer.parseInt(request.getParameter("id")));
		e.setName(request.getParameter("name"));
		e.setSalary(Float.parseFloat(request.getParameter("salary")));
		
		out.println("<h2> Employee's Details</h2>");
		out.println("<h2>ID: " + e.getId()+"</h2>");
		out.println("<h2>Name: " + e.getName()+"</h2>");
		out.println("<h2>Salary: " + e.getSalary()+"</h2>");
	}

}
