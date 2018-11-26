package homework.hw13;

import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;

/**
 * Класс содержащий ДЗ №12.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW13 extends AbstractRunnableHomework {

    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW13() throws InvalidHomeworkNumberException {
        setTasksAmount(3);
        initialize(13);
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
            case 3: {
                this.task3();
                break;
            }
            default: {
                throw new InvalidTaskNumberException(number + " неправильный номер задания");
            }
        }
        System.out.println();
    }

    private void task1() {

    }

    private void task2() {

    }

    private void task3() {

    }
}
