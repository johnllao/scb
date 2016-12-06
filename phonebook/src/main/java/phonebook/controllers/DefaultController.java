package phonebook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping("/")
	public String index(Model model) {
		//select id, name, tel, mobile, email, address, city, country, postal_code from friends
		return "index";
	}
	
}
