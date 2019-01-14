package test.professional.jdbcConnector;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo1 {
    public static void main(String[] args) {
        DBConnect dc = new DBConnect();
    }
}

class DBConnect {

    private Connection connection;

    public DBConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/whiz", "whizlabs", "ocpjp");
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
