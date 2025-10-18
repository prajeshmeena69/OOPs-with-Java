package Unit_2;

public class Constructor_Reference {
    public static interface Messagable {
        Message getMessage(String msg);
    }

    public static class Message {
        Message(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Messagable hello = Message::new;
        hello.getMessage("Hello");
    }
}