package homework.hw9;

/**
 * Класс нити для задания 1 ДЗ №9.
 *
 * @author Gnitko Andrei
 */
public class HW9Tread extends Thread {
    /**
     * Период вывода имени (нс)
     */
    private int period;

    /**
     * Конструктор задающий имя нити и период вывода имени (нс)
     *
     * @param name   имя нити
     * @param period период вывода имени (нс)
     */
    public HW9Tread(String name, int period) {
        super(name);
        this.period = period;
    }

    /**
     * Нить выводит в консоль свое имя с заданной периодичностью
     *
     * @see HW9Tread#period
     */
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
