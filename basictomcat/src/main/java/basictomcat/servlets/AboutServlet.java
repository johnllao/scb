package basictomcat.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="AboutServlet", 
            urlPatterns="/about")
public class AboutServlet extends HttpServlet{
	
	private static final long serialVersionUID = 2733502798402137000L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		final String author = req.getParameter("author");
			
		res.setHeader("Content-type", "text/plain");
		
		final PrintWriter writer = res.getWriter();
		writer.println("Servlet Demo");
		writer.println("version 1.0.0");
		writer.printf("author: %s\n", author == null ? "none" : author);
		
		writer.flush();
	}

}
