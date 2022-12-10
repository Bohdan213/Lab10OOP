package adapter.task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportBuilderTest {
    private static Database db;
    private static ReportBuilder rb;

    @BeforeAll
    public static void prepared() {
        db = new Database();
        rb = new ReportBuilder(db);
    }

    @Test
    public void testReport() {
        assertSame("name: Bohdan\nsex: male\nage: 19\n", this.rb.buildReport());
    }
}