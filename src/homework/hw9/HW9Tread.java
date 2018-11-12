package homework.hw9;

public class HW9Tread extends Thread{
    private int period;
    public HW9Tread(String name, int period) {
        super(name);
        this.period = period;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(period);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(super.getName());
        }
    }
}
