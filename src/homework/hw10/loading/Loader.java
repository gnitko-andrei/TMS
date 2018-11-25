package homework.hw10.loading;

/**
 * Класс грузчика.
 *
 * @author Gnitko Andrei
 */
public class Loader extends Thread {
    /**
     * Производительность.
     */
    private int productivity;
    /**
     * Число погруженных ящиков
     */
    private int boxNumber;
    /**
     * Текущее задание на погрузку
     */
    private Loading loading;

    /**
     * Конструктор, задающий имя, продуктивность и задание на погрузку.
     *
     * @param name         имя
     * @param productivity производительность
     * @param loading      задание на погрузку
     */
    public Loader(String name, int productivity, Loading loading) {
        super(name);
        this.productivity = productivity;
        this.loading = loading;
    }

    /**
     * Процесс погрузки ящиков в соответствии с заданной производительностью
     */
    @Override
    public void run() {
        System.out.println(getName() + " начал работать");
        while (true) {
            synchronized (this) {
                try {
                    this.wait(60000 / productivity);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (loading.getBoxNumber() > 0) {
                    loading.takeBox();
                    System.out.println(getName() + " погрузил ещё один ящик, осталось ещё " + loading.getBoxNumber());
                    boxNumber++;
                } else {
                    System.out.printf("%s погрузил %s ящиков%n", getName(), boxNumber);
                    return;
                }
            }


        }

    }

    /**
     * Геттер для производительности.
     * @return производительность
     */
    public int getProductivity() {
        return productivity;
    }

    /**
     * Сеттер для производительности.
     * @param productivity производительность
     */
    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }
}
