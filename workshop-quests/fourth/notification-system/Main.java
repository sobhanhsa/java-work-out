public class Main {
    public static void main(String[] args) {
        NotificationService services[] = new NotificationService[2];
        services[0] = new SmsService("Hello, this is a test message.");
        services[1] = new EmailService("Hello, this is a test email.");
        
        for (NotificationService service : services) {
            service.send();
            if (service instanceof SmsService) {
                SmsService sms = (SmsService) service;
                sms.checkSignalStrength();
            }
        }
    }
}
