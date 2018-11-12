package homework.hw9;

import homework.hw9.loading.Loader;
import homework.hw9.loading.Loading;

public class HW9 {
    public static void main(String[] args) {
        HW9 hw = new HW9();
        hw.task2();
    }

    private void task1() {
        Thread thread1 = new Thread(new HW9Tread("thread1", 500));
        Thread thread2 = new Thread(new HW9Tread("thread2", 1000));
        Thread thread3 = new Thread(new HW9Tread("thread3", 1500));
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private void task2() {
        Loading loading = new Loading(50, 3);
        Loader loader1 = new Loader("loader1", 10, loading);
        Loader loader2 = new Loader("loader2", 15, loading);
        Loader loader3 = new Loader("loader3", 5, loading);
        loader1.start();
        loader2.start();
        loader3.start();
    }
}
