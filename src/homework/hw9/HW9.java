package homework.hw9;

import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;
import homework.hw9.loading.Loader;
import homework.hw9.loading.Loading;

/**
 * Класс содержащий ДЗ №9.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW9 extends AbstractRunnableHomework {
    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW9() throws InvalidHomeworkNumberException {
        setTasksAmount(2);
        initialize(9);
    }

    /**
     * @param number - номер задания
     * @throws InvalidTaskNumberException исключение выбрасывается в случае несовпаденя номера задания с перечисленными в блоке switch
     */
    @Override
    public void chooseTask(int number) throws InvalidTaskNumberException {
        switch (number) {
            case 1: {
                this.task1();
                break;
            }
            case 2: {
                this.task2();
                break;
            }
            default: {
                throw new InvalidTaskNumberException(number + " неправильный номер задания");
            }
        }
        System.out.println();
    }

    /**
     * Task 1
     * Создать 3 потока, все должны выводить в консоль свое имя (для удобства задайте свое).
     * 1 должен писать в консоль каждые 500мс, 2 - 1000мс, 3 - 1500мс. Параметризовать создание потоков.
     */
    private void task1() {
        Thread thread1 = new Thread(new HW9Tread("thread1", 500));
        Thread thread2 = new Thread(new HW9Tread("thread2", 1000));
        Thread thread3 = new Thread(new HW9Tread("thread3", 1500));
        thread1.start();
        thread2.start();
        thread3.start();
    }

    /**
     * Task 2
     * Реализовать программу, которая должна эмулировать загрузку автомобиля коробками.
     * Создать сущность водителя и грузчиков. При запуске можно задать количество коробок,
     * сколько должно быть загружено, а также количество грузчиков. Грузчики могут иметь разную производительность.
     * Все должно быть реализовано с помощью потоков. В конце вывести статистику, какой грузчик сколько коробок загрузил.
     */
    private void task2() {
        Loading loading = new Loading(50, 3);
        Loader loader1 = new Loader("loader1", 100, loading);
        Loader loader2 = new Loader("loader2", 150, loading);
        Loader loader3 = new Loader("loader3", 50, loading);
        loader1.start();
        loader2.start();
        loader3.start();
    }
}
