package jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class MysqlConnectionFactory {
	private static BasicDataSource bds;
	
	static {
		Properties pro=new Properties();
		InputStream input=MysqlConnectionFactory.class.getClassLoader().getResourceAsStream("/jdbc.properties");
		
		try {
			pro.load(input);
			bds=BasicDataSourceFactory.createDataSource(pro);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return bds.getConnection();
	}
	public static void close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
