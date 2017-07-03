package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ScopeServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/HTML");
		
		String data=request.getParameter("userName");
		
		HttpSession session=request.getSession();
		ServletContext context=getServletContext();
		
		if(data.length()>0){
			session.setAttribute("userName", data);
			context.setAttribute("userName", data);
		}
		
		out.println("<h2>"+data+",using parameter</h2>");
		out.println("<h2>"+session.getAttribute("userName")+",using parameter</h2>");
		out.println("<h2>"+context.getAttribute("userName")+",using parameter</h2>");
		
	}

}
