package homework;

/**
 * Исключение для случаев ввода неверного номера задания.
 *
 * @author Gnitko Andrei
 */
public class InvalidTaskNumberException extends Throwable {
    /**
     * @param message - сообщение об ошибке
     */
    public InvalidTaskNumberException(String message) {
        super(message);
    }
}
