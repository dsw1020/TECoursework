package com.techelevator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NameServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<String> names = new ArrayList<String>();
		names.add("André");
		names.add("Matt");
		names.add("Vineeta");
		names.add("Diane");
		names.add("Apple");
		names.add("Leon");
		names.add("C.J.");

		/* This line adds a request attribute with the name "studentList"
		 * that contains our list of student names. This will later be
		 * used by the View (i.e. JSP) to display student names in HTML 
		 * 
		 *  setAttribute() - a method provided by the HttpRequest class to add
		 * 					 entries to the requestMap in the RequestMap
		 * 
		 * 					 requestObjectName.setAttribute(key,value)
		 * 
		 * */
		req.setAttribute("nameList", names); // Add the List with our data to the requestMap

		/* This line forwards the request to the JSP 
		 * Tell the server to run this .jsp and forward it the Request and Responses it received*/
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/nameList.jsp").forward(req, resp);
	}
}
