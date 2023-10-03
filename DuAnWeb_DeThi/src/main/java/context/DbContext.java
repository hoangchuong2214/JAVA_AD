package context;
import java.sql.*;

public class DbContext {
    
    private final String serverName = "localhost";
    private final String dbName = "HoaTuoiDB";
    private final String portNumber = "1433";  
    private final String userID = "sa";
    private final String password = "1234";
    
    public Connection getConnection()
    {
        Connection conn=null;
        try{ 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //b2. dinh nghia chuoi ket noi URL
            String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName+";encrypt=false";
            String url1 = "jdbc:sqlserver://" + serverName + ":1433"
                    + ";instance=" + "DESKTOP-P3705HF\\SQLEXPRESS" + ";databaseName="+ "HoaTuoiDB;encrypt=false";
            //b3.Thiet lap ket noi
            conn = DriverManager.getConnection(url,userID,password);
        }catch(Exception ex){
            System.out.println("Error:" + ex.toString());
        }
        return conn;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Ket Qua ket noi:" + new DbContext().getConnection());
    }
}
