package homework;

/**
 * Интерфейс для ДЗ с возможностью запуска отдельных заданий используя класс homework/Runner.java.
 *
 * @author Gnitko Andrei
 */
public interface RunnableHomework {
    /**
     * Метод для запуска выполнения конкретных заданий.
     *
     * @throws InvalidTaskNumberException
     */
    void runTask() throws InvalidTaskNumberException;

    /**
     * Метод для запуска выполнения конкретного задания по номеру.
     *
     * @param number - номер задания
     * @throws InvalidTaskNumberException
     */
    void chooseTask(int number) throws InvalidTaskNumberException;
}
