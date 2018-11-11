package classwork.cw9;

import java.time.LocalTime;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        System.out.println("MyThread " + Thread.currentThread());
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("MyThread running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
