package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Page")
public class Page extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Query q=new Query();	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opration=request.getParameter("button");int res=-1;
		switch (opration) {
		case "post":
			String answer=request.getParameter("ans");
			int current=Integer.parseInt(request.getParameter("id"));
			 res=new Query().putAnswer(current,answer);
			
			if(res>0){
				request.getRequestDispatcher("index.jsp").include(request, response);
			}			
			break;
		case "question":
			String question=request.getParameter("ques");
			 res=new Query().submitQuestion(question);
			 if(res>0){
					request.getRequestDispatcher("index.jsp?no="+2).include(request, response);
				}
			break;

		default:
			break;
		}
		
	}

}
