package servidor.data;

import java.sql.*;

/**
 * @authors Maria Alejandra Reyes Gonzalez, Maria Jose Villalba Lozano
 *
 */

public class DataSource  
{
	private Connection cnn;
	private static DataSource dataSource = null;
	private String url = "jdbc:mysql://localhost:3306/trabajo";
	private String user = "root";
	private String password = "";

	public Connection getCnn()
	{
		return cnn;
	}

	public void setCnn(Connection con)
	{
		cnn = con;
	}

	 public DataSource() {
//	        Properties conProperties = new Properties();
	        try {
//	            conProperties.load(new FileInputStream("src/controller.data/connection.properties"));
//	            String url = conProperties.getProperty("url");
//	            String user = conProperties.getProperty("user");
//	            String password = conProperties.getProperty("password");
	            cnn = DriverManager.getConnection(url, user, password);

	            System.out.println("Successful connection");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public static DataSource getInstance(){
	        if (dataSource == null){
	            dataSource = new DataSource();
	        }
	        return dataSource;
	    }
	    
	    
	    public ResultSet runQuery(String sql){
	        ResultSet resultSet = null;
	        try {
	            Statement statement = cnn.createStatement();
	            resultSet = statement.executeQuery(sql);
	            System.out.println("Successful query: "+sql);
	        } catch (SQLException e) {
	            System.out.println("Query error: "+e.getMessage());
	        }
	        return resultSet;
	    }

	    @SuppressWarnings("unused")
		public boolean runUpdateQuery(String sql)
	    {
	        int rows=0;
	        try {
	            Statement statement = cnn.createStatement();
	            rows = statement.executeUpdate(sql);
	            System.out.println("Successful query: "+sql);
	            return true;
	        } catch (SQLException e) {
	            System.out.println("Query error: "+e.getMessage());
	            return false;
	        }
	    }
	
}
