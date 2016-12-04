package springboot.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AppInfoController {

	@RequestMapping(path="version", produces=MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> version() {
		final Map<String, Object> result = new HashMap<String, Object>();
		result.put("version", "1.0.0");
        return result;
    }

}
