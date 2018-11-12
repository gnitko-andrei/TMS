package homework.hw9.loading;

import java.sql.SQLOutput;

public class Loader extends Thread {
    private int productivity;
    private int boxNumber;
    Loading loading;

    public Loader(String name, int productivity, Loading loading) {
        super(name);
        this.productivity = productivity;
        this.loading = loading;
    }

    @Override
    public void run() {
        System.out.println(getName() + " начал работать");
        while (true) {
            if (loading.getBoxNumber() > 0) {
                try {
                    Thread.sleep(60000 / productivity);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                loading.takeBox();
                System.out.println(getName() + " погрузил ещё один ящик, осталось ещё " + loading.getBoxNumber());
                boxNumber++;
            } else {
                System.out.printf("%s погрузил %s ящиков%n", getName(), boxNumber);
                return;
            }

        }

    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }
}
