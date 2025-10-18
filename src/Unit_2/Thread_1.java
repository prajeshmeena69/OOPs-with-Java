package Unit_2;

public class Thread_1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10000);
            }

            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println(i);
        }
    }
}
