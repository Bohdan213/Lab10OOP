package adapter.task3;

public class Authorisation extends Авторизація{
    public boolean authorize(БазаДаних db) {
        return авторизуватися(db);
    }
}
