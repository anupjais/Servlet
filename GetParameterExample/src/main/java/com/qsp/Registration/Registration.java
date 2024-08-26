package com.qsp.Registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("un");
		String pass = req.getParameter("pass");
		String phone = req.getParameter("ph");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1> Hey "+user+" !</h1>");
		pw.print("<h1> Mobile +91"+phone+".</h1>");
	}

}
