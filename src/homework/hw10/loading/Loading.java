package homework.hw10.loading;

/**
 * Класс задания на погрузку для грузчиков.
 *
 * @author Gnitko Andrei
 * @see Loader
 */
public class Loading {
    /**
     * Количество коробок, которые нужно загрузить.
     */
    private int boxNumber;
    /**
     * Количество грузчиков, учавчтвующих в погрузке.
     */
    private int loadersNumber;

    /**
     * Конструктор, задающий количество коробок, которые нужно загрузить
     * и количество грузчиков, учавчтвующих в погрузке.
     * @param boxNumber количество коробок, которые нужно загрузить
     * @param loadersNumber количество грузчиков, учавчтвующих в погрузке
     */
    public Loading(int boxNumber, int loadersNumber) {
        this.boxNumber = boxNumber;
        this.loadersNumber = loadersNumber;
    }

    /**
     * Метод для взятия коробки грузчиком
     */
    void takeBox() {
        if (boxNumber > 0) {
            --boxNumber;
        }

    }

    /**
     * Геттер количества коробок, которые нужно загрузить.
     * @return количество коробок, которые нужно загрузить
     */
    int getBoxNumber() {
        return boxNumber;
    }

    /**
     * Сеттер количества коробок, которые нужно загрузить.
     * @param boxNumber количество коробок, которые нужно загрузить
     */
    public void setBoxNumber(int boxNumber) {
        this.boxNumber = boxNumber;
    }

    /**
     * Геттер количества грузчиков, учавчтвующих в погрузке.
     * @return количество грузчиков, учавчтвующих в погрузке.
     */
    public int getLoadersNumber() {
        return loadersNumber;
    }

    /**
     * Сеттер количества грузчиков, учавчтвующих в погрузке.
     * @param loadersNumber количество грузчиков, учавчтвующих в погрузке.
     */
    public void setLoadersNumber(int loadersNumber) {
        this.loadersNumber = loadersNumber;
    }
}
