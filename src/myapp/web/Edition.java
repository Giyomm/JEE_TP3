package myapp.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myapp.Person;

@WebServlet("/edition")
public class Edition extends HttpServlet {

	public void init (ServletConfig c) throws ServletException {
		
	}
	
	public void destroy () {
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			   throws IOException, ServletException
	{
		
		if(request.getSession().getAttribute("person") == null)
			request.getSession().setAttribute("person", new Person());
			
		Person p = (Person) request.getSession().getAttribute("person");
		p.setPersonID(Integer.valueOf(request.getParameter("ID")));
		p.setNom(request.getParameter("nom"));
		p.setPrenom(request.getParameter("prenom"));
		p.setAdresseMail(request.getParameter("mail"));
		
		request.getSession().setAttribute("person", p);
		request.getRequestDispatcher("/person.jsp").forward(request, response);
			   
	}
	
}
