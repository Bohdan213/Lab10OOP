package adapter.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    public static Login lg = new Login();

    @Test
    public void testClients() {
        assertTrue(lg.login("twitter") instanceof TwitterClient);
        assertTrue(lg.login("facebook") instanceof FacebookClient);
    }

}