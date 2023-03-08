package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		    response.setContentType("text/html");
	        PrintWriter pw=response.getWriter();
	        pw.write("<h1>Welcome to Register Servlet");
	        String username=request.getParameter("user_name");
	        String password=request.getParameter("password");
	        pw.write("<h3>Username : "+username+"</h3>");
	        pw.write("<h3>Password : "+password+"</h3>");
	        
	        RequestDispatcher rd=request.getRequestDispatcher("success");
	        rd.include(request, response);
	        
	}

}
