package homework;

/**
 * Исключение для случаев ввода неверного номера ДЗ.
 *
 * @author Gnitko Andrei
 */
public class InvalidHomeworkNumberException extends Throwable {
    /**
     * @param message - сообщение об ошибке
     */
    public InvalidHomeworkNumberException(String message) {
        super(message);
    }
}
