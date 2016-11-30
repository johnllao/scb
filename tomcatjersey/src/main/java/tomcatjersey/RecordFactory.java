package tomcatjersey;

import java.sql.ResultSet;

public interface RecordFactory<T> {
	public T create(ResultSet resultSet) throws Exception;
}
