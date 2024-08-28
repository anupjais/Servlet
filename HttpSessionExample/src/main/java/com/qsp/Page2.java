package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page2")
public class Page2 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Object name = req.getAttribute("name");
		Object mobile = req.getAttribute("mobile");
		
		PrintWriter pw = resp.getWriter();
		if(name!=null)
		{
			pw.print("<h1> Hey "+name+"! This is Page2.</h1>");
		}else {
			pw.print("<h1> Hey \"user\" you are logout</h1>");
		}
	}
}
