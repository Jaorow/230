enum NotificationType {SMS, EMAIL; }

interface Notification {
    void notifyUser();
}

class NotificationFactory{
    public Notification createNotification(NotificationType notificationType){
        switch (notificationType) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                break;
        }
        return null;
    }
}

class SMSNotification implements Notification{
    public void notifyUser() {
        System.out.println("Sending a SMS notification");
    }
    
}

class EmailNotification implements Notification{
    public void notifyUser() {
     System.out.println("Sending an e-mail notification");
    }   
}
