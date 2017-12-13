package com.tundla.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.http.*;


public class SecondAttribute extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		resp.setContentType("Html/Text");
		PrintWriter out = resp.getWriter();
		
		Object obj = req.getAttribute("requestKey");
		if(obj==null)out.println("Request Attribute are not present");
		else out.println("Request Attirbute are present :"+obj);
		
	}
}
