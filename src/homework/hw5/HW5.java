package homework.hw5;

import homework.AbstractHomework;
import homework.InvalidHomeworkNumberException;

/**
 * Класс содержащий ДЗ №5.
 *
 * @author Gnitko Andrei
 * @see AbstractHomework
 */
public class HW5 extends AbstractHomework {
    /**
     * Контруктор, задающий имя и номер ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW5() throws InvalidHomeworkNumberException {
        initialize(5);
    }
}
