package com.techelevator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Person> personList = new ArrayList<Person>();
		
		//						  first	  last  	  age
		//						  name	  name
		
		personList.add(new Person("Mike", "Mazzullo", 21)); // Adding objects to the List to be passed in the request map
		personList.add(new Person("Asher", "Díaz", 22));
		personList.add(new Person("Sondra", "Coffin", 23));
		personList.add(new Person("Jeff", "Prescott", 12));

		req.setAttribute("personList", personList);
		req.setAttribute("Kurt", "pick something for me ");
		req.setAttribute("Year", new Integer(2020));
		
		getServletContext().getRequestDispatcher("/WEB-INF/personList.jsp").forward(req, resp);
	}
}
