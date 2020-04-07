package com.techelevator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override   // in the HttpServley class 'doGet' handles GET requests from the browser
	
	
	//       parameters:  GET request from browser, Response object to fill and return
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");   // Get the value from the name= parameter
		if (name == null) {
			name = "World";
		}
// Creating html to return to browser in the response object
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html>");
		response.getWriter().println("<body>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>HelloServlet</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<h1>Hello, " + name + "!</h1>");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
	}
}
