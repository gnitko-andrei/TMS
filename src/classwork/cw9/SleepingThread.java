package classwork.cw9;

public class SleepingThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("SleepingThread");
    }
}
