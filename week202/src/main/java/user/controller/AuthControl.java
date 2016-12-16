package user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.UserDao;
import utils.UserJDBCDao;


@Path("/login.jsp")
public class AuthControl extends HttpServlet {
	
	UserDao userDao;
	
	@Override
	public void init() throws ServletException {
		this.userDao = new UserJDBCDao();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// get login and password
		String login= "";
		String password ="";
		
		// check authentication of user
		if (this.userDao.checkPassword(login, password)) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/.jsp").forward(req, resp);
		}
		else {
			out.write("<div class='alert alert-danger' role='alert'>Erreur Email et/ou Mot de passe</div>");
		}
	}
	

}
