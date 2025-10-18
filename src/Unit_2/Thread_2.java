package Unit_2;

public class Thread_2 extends Thread_1 {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(2000);
            }

            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print(i + " ");
        }
    }
}
