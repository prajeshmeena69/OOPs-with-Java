package Unit_2;

public class MyMain {
    public static void main(String[] args) {
        Thread th1 = new Thread_1();
        th1.start();
        System.out.println(th1.getName());
        th1.setName("KIET Thread");
        System.out.println(th1.getName());
        System.out.println(th1.getPriority());
        th1.setPriority(9);
        System.out.println(th1.getPriority());
    }
}
