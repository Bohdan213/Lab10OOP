package adapter.task3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorisation auth = new Authorisation();
        if (auth.authorize(db)) {
            ReportBuilder rb = new ReportBuilder(db);
            System.out.println(rb.buildReport());
        }
    }
}
