package adapter.task3;

public class ReportBuilder {
    private БазаДаних db;
    public ReportBuilder(БазаДаних db) {
        this.db = db;
    }

    public String buildReport() {
        return "name: Bohdan\nsex: male\nage: 19\n";
    }
}