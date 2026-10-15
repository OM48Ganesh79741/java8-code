package waitAndNotify;

public class Launch {
    public static void main(String[] args) {
        Message message = new Message();

        User sender = new User(message);
        sender.setName("raju");

        User receiver = new User(message);
        receiver.setName("kaju");

        sender.start();
        receiver.start();
    }
}
