package springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelpController {

	@RequestMapping("/help")
	public String index(Model model) {
		model.addAttribute("header", "Help");
		model.addAttribute("data", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc lacinia, massa ut luctus laoreet, dui dolor porta mauris, ut lacinia metus lacus nec lacus. Curabitur dignissim leo at turpis dictum, id commodo est suscipit. Nullam auctor egestas odio eget bibendum. Nunc hendrerit molestie risus. Aliquam sit amet nibh maximus, fermentum ipsum sit amet, dapibus lacus. Ut faucibus lacus nec tristique fringilla. Quisque eu orci finibus, auctor arcu ut, consequat ligula. Praesent quis ipsum mi. Aenean tincidunt feugiat neque id congue");
		return "help/index";
	}
	
	@RequestMapping("/help/endpoints")
	public String helpEndPoints(Model model) {
		model.addAttribute("header", "Endpoints");
		model.addAttribute("data", "Donec sit amet arcu risus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis vulputate erat vulputate ex venenatis gravida. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec id sapien quis elit aliquet viverra at at mauris. Vivamus id risus sed sapien eleifend luctus at quis risus. Donec blandit id diam vel semper. Aenean ut massa eget nisl rutrum tempor finibus eu ante. Etiam vitae felis libero. Praesent vestibulum interdum felis, et fermentum risus aliquet at. Cras varius mollis massa, quis rutrum purus mollis non. Nullam nulla eros, luctus in fringilla ut, accumsan et magna. Mauris laoreet porttitor ligula in porttitor. In quis tempor lorem. In egestas imperdiet lacus a ullamcorper. Aliquam faucibus vitae tellus a efficitur. ");
		return "help/endpoints";
	}
}
