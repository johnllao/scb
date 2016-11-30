package tomcatjersey.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("help")
public class HelpApi {

	@GET
	@Path("version")
	@Produces(MediaType.TEXT_PLAIN)
	public String version() {
		return "1.0.0";
	}
	
}
