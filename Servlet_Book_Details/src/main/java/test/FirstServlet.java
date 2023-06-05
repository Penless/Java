package test;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet implements Servlet {
	public void init(ServletConfig sc) throws ServletException{
		//NoCode
	}
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String code = req.getParameter("code");
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		float price = Float.parseFloat(req.getParameter("price"));
		int qty = Integer.parseInt(req.getParameter("qty"));
		pw.println("****Book Details****");
		pw.println("<br>BookCode:" + code);
		pw.println("<br>BookName:" + name);
		pw.println("<br>BookAuthor:" + author);
		pw.println("<br>Bookprice:" + price);
		pw.println("<br>Bookquantity:" +qty);
	}
	
	public void destroy() {
		
	}
		
	public ServletConfig getServletConfig() {
		return this.getServletConfig();//Demo Code
	}	
	
	public String getServletInfo() {
		return "FirstServlet reading data from HTML";//Demo Code
	}

}
