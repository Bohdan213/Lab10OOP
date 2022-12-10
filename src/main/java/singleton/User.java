package singleton;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.SQLException;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private int age;

    public void save() throws SQLException {
        DBConnection dbConnection = DBConnection.getInstance();
        String query = String.format("INSERT INTO user (email, name, age) VALUES ('%s', '%s', %d);",
                email, name, age);
        dbConnection.executeQuery(query);
    }
}
