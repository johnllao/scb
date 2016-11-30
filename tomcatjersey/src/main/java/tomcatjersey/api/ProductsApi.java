package tomcatjersey.api;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tomcatjersey.Database;
import tomcatjersey.RecordFactory;

@Path("products")
public class ProductsApi {

	public static final String CONNECTION_URL = "jdbc:sqlserver://PIKACHU\\SQLEXPRESS;databaseName=Northwind;user=sa;password=P@ssw0rd;";
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Map<String, Object>> index() {
		
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>(); 
		try (Database db = Database.create(CONNECTION_URL) ) {
			
			result = db.<Map<String, Object>>query("select ProductID, ProductName, UnitPrice from dbo.Products ", 
					new RecordFactory<Map<String, Object>>() {

						@Override
						public Map<String, Object> create(ResultSet resultSet) throws Exception {
							
							final Map<String, Object> r = new HashMap<String, Object>();
							r.put("id", resultSet.getInt("ProductID"));
							r.put("name", resultSet.getString("ProductName"));
							r.put("price", resultSet.getDouble("UnitPrice"));
							
							return r;
						} 
				
			});
			
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return result;
		
	}
	
}
