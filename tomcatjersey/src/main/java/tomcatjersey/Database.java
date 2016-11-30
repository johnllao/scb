package tomcatjersey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class Database implements AutoCloseable {
	
	private Connection connection;
	
	private Database(final String url) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		this.connection = DriverManager.getConnection(url);
	}
	
	public static Database create(final String url) throws ClassNotFoundException, SQLException {
		return new Database(url);
	}

	public <T> List<T> query (String sql, RecordFactory<T> factory) throws Exception {

		final Statement statement = this.connection.createStatement();
		final ResultSet resultSet = statement.executeQuery(sql);

		final List<T> list = new ArrayList<T>();

		while(resultSet.next()) {

			list.add(factory.create(resultSet));

		}

		return list;

	}

	

	public void execute(String sql) throws SQLException {

		final Statement statement = this.connection.createStatement();
		statement.execute(sql);
		
	}

	

	public void execute(String... sql) throws SQLException {

		final Statement statement = this.connection.createStatement();
		for(String s : sql) {
			statement.addBatch(s);
		}

		statement.executeBatch();

	}
	
	@Override
	public void close() throws Exception {
		if (this.connection != null && !this.connection.isClosed())
			this.connection.close();
	}
	
}
