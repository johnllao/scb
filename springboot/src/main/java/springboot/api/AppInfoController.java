package springboot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppInfoController {

	@RequestMapping("/api/version")
    public String greeting() {
        return "1.0.0";
    }

	
}
