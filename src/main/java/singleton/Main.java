package singleton;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User(1, "Bohdan", "ya.bohdan", 19);
        user.save();
    }
}
