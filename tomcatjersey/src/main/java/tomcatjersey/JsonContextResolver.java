package tomcatjersey;

import javax.ws.rs.ext.ContextResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonContextResolver implements ContextResolver<ObjectMapper> {

	private final ObjectMapper defaultObjectMapper; 
	
	public JsonContextResolver() {
		this.defaultObjectMapper = new ObjectMapper();
		this.defaultObjectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
	}
	
	@Override
	public ObjectMapper getContext(Class<?> arg0) {
		return defaultObjectMapper;
	}

}
