package pl.coderslab.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DbConnection {
    static Connection getConnection(String dbName) throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false&characterEncoding=utf8",
                "root", "rootroot");
    }
}
