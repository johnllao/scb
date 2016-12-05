package springboot.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.models.Weather;

@RestController
@RequestMapping("api/weather")
public class WeatherApi {

	private final Map<String, Weather> data = new HashMap<String, Weather>();
	
	public WeatherApi() {
		this.data.put("CCK", new Weather("Choa Chu Kang", "84 F", "Mostly Cloudy", "6 mph", "78%", "29.80 in", "77 F", "10 mi", "0"));
		this.data.put("TAM", new Weather("Tampines", "82 F", "Partly Cloudy", "6 mph", "73%", "29.83 in", "73 F", "10 mi", "0"));
		this.data.put("BTB", new Weather("Bukit Batok", "84 F", "Thunderstorm", "6 mph", "78%", "29.83 in", "77 F", "10 mi", "0"));
	}
	
	@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public Collection<Weather> index() {
        return this.data.values();
    }
	
	@RequestMapping(path="{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public Weather id(@PathVariable("id") String id) {
        return this.data.get(id);
    }
}
