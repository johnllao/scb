package springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelpController {

	@RequestMapping("/help")
	public String index(Model model) {
		model.addAttribute("header", "Help");
		return "help";
	}
	
	@RequestMapping("/help/endpoints")
	public String helpEndPoints(Model model) {
		model.addAttribute("header", "Help - Endpoints");
		return "help/endpoints";
	}
}
