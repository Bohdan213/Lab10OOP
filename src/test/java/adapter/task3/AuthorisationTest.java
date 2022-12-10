package adapter.task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorisationTest {
    private static Authorisation auth;
    private static Database db;

    @BeforeAll
    public static void prepared() {
        auth = new Authorisation();
        db = new Database();
    }

    @Test
    public void testAuthorisation() {
        assertTrue(auth.authorize(db));
    }
}