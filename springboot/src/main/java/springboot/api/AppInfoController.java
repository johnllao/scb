package springboot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AppInfoController {

	@RequestMapping("version")
    public String version() {
        return "1.0.0";
    }

	
}
