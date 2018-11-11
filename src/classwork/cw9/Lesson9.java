package classwork.cw9;

import classwork.сw8.Lesson8;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lesson9 {
    public static void main(String[] args) throws InterruptedException {
        Lesson9 lesson9 = new Lesson9();
        Thread thread1 = new Thread(new MyThread("1"));
        Thread thread2 = new Thread(new MyThreadImpl());
        Thread thread3 = new Thread(new SleepingThread());
        thread1.setDaemon(true);
        thread2.setDaemon(true);
        System.out.println("start");
        thread3.start();
        thread3.join(500);
        thread1.start();
        thread2.start();
        lesson9.sleep(1000);
    }
    public void sleep(int millies) throws InterruptedException {
        System.out.println("Start" + LocalTime.now());
        Thread.sleep(millies);
        System.out.println("End" + LocalTime.now());
    }




}
