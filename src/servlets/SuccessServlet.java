package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class SuccessServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.write("<h1>Successfully saved</h1>");
	}
 
}
