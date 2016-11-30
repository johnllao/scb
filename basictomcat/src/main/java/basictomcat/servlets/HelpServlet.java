package basictomcat.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="HelpServlet", 
            urlPatterns="/help")
public class HelpServlet extends HttpServlet {

	private static final long serialVersionUID = -7191151071503980878L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		final String[] name = req.getParameterValues("name");
		final ServletContext ctx = req.getServletContext();
		ctx.setAttribute("name", name == null || name[0] == null ? "none" : name[0]);
		
		final RequestDispatcher dispatcher = req.getRequestDispatcher("help.jsp");
		dispatcher.forward(req, res);
		
	}
}
