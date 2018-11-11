package classwork.cw9;

public class MyThreadImpl implements Runnable {
    public MyThreadImpl() {

        System.out.println("MyThread " + Thread.currentThread());
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("I'm running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
