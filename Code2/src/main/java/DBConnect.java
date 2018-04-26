import java.io.*;
import java.sql.*;
import java.util.Properties;

public class DBConnect {


    Connection conn = null;
    String dbURL = null;
    String dbUserName = null;
    String dbpassword = null;

    public Connection connectdb() throws IOException {

        getURL();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, dbUserName, dbpassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public void getURL() throws IOException {

        InputStream inputStream;

        Properties prop = new Properties();
        {
            inputStream = readPropertyFile("../credentials.txt");
            prop.load(inputStream);
        }
        dbURL = prop.getProperty("URL");
        dbUserName = prop.getProperty("DB_USERNAME");
        dbpassword = prop.getProperty("DB_PASSWORD");

        System.out.println("DB connection established successfully ");

    }



    private InputStream readPropertyFile(String filePath) throws IOException {
        return new FileInputStream(filePath);

    }
}


