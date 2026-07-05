public class EmailService extends NotificationService {
    EmailService(String txt) {
        super(txt);
    }

    @Override
    public void send() {
        System.out.println("Sending Email: [ " + txt + " ] to user inbox.");
    }
    
}
