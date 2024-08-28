package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/creatSession")
public class CreateSession extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String name = req.getParameter("user");
		String mobile = req.getParameter("phone");
		session.setAttribute("name",name);
		session.setAttribute("mobile",mobile);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>Session Created.</h1>");
	}

}
