package homework.hw5.transport;

/**
 * Исключение для случаев ввода неверных аргументов метода.
 *
 * @author Gnitko Andrei
 */
public class IllegalArgumentException extends Exception {
    /**
     * @param message - сообщение об ошибке
     */
    public IllegalArgumentException(String message) {
        super(message);
    }
}
