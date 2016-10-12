package myapp.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myapp.Person;
import myapp.PersonManager;
import myapp.errors.PersonError;

@WebServlet("/edition")
public class Edition extends HttpServlet {

	private static final long serialVersionUID = 1L;

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
		p.setPersonID(request.getParameter("ID"));
		p.setNom(request.getParameter("nom"));
		p.setPrenom(request.getParameter("prenom"));
		p.setAdresseMail(request.getParameter("mail"));
		p.setDateNaissance(request.getParameter("dateNaissance"));
		
		PersonManager pm = new PersonManager();
		PersonError err = new PersonError();

		try {
			err = pm.check(p);
			if(err.isHasError()){
				request.setAttribute("personErr", err);
				request.getRequestDispatcher("/edition.jsp").forward(request, response);
			}
			else{
				pm.save(p);
				request.getSession().setAttribute("person", p);
				request.getRequestDispatcher("/person.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
}
