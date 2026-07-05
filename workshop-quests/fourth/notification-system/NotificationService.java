abstract public class NotificationService {
    protected String txt;
    NotificationService(String txt) {
        this.txt = txt;
    }

    abstract public void send();
}
