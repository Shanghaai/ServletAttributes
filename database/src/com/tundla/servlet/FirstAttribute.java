package com.tundla.servlet;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class FirstAttribute extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) 
			throws ServletException, IOException
	{
		ServletContext context = getServletContext();
		context.setAttribute("contextKey", new Object());
		req.setAttribute("requestKey", "Attribute of request");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Second");
		dispatcher.forward(req,resp);
	}
}
