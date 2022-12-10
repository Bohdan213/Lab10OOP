package singleton;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static DBConnection dbconnection;

    private Connection connection;

    private DBConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
        Statement stmt = connection.createStatement();
        String query = "create table if not exists user\n" +
                "(\n" +
                "id    integer primary key autoincrement,\n" +
                "name  text,\n" +
                "email text,\n" +
                "age integer\n" +
                ")";
        stmt.executeUpdate(query);
        stmt.close();
    }

    public void executeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
    }

    public static DBConnection getInstance() throws SQLException {
        if (dbconnection == null) {
            dbconnection = new DBConnection();
        }
        return dbconnection;
    }
}