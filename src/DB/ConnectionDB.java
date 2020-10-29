package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=ElectronicStore;";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "08iahkcud";
    public static Connection getConnectionDB() {
    	Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return cn;
    }
}