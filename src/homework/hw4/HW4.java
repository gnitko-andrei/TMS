package homework.hw4;

import homework.AbstractHomework;
import homework.InvalidHomeworkNumberException;


/**
 * Класс содержащий ДЗ №4.
 *
 * @author Gnitko Andrei
 * @see AbstractHomework
 */
public class HW4 extends AbstractHomework {

    /**
     * Контруктор, задающий имя и номер ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW4() throws InvalidHomeworkNumberException {
        initialize(4);
    }
}
