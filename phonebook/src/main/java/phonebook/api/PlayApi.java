package phonebook.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/play")
public class PlayApi {
	
	@GetMapping
	public String get() {
		return "Let's play!";
	}
	
	@GetMapping("{id}")
	public String getById(HttpSession session, HttpServletRequest req, @PathVariable("id") final String id) {
		final String propertyValue= req.getParameter("property");
		return String.format("Let's play!\nYour ID is %s\nproperty value is %s\nSession ID is %s", 
				id, propertyValue, session.getId());
	}
}
