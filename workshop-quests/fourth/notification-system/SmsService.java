public class SmsService extends NotificationService {
    SmsService(String txt) {
        super(txt);
    }

    @Override
    public void send() {
        System.out.println("Sending Sms: [ " + txt + " ] to user phone.");
    }
    
    public void checkSignalStrength() {
        System.out.println("[SMS System Status]: GSM Signal is strong. Provider: MCI");
    }

}
