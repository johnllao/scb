package tomcatjersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class App extends ResourceConfig {
	
	public App() {
		packages("tomcatjersey.api");
		register(JsonContextResolver.class);
	}
	
}
