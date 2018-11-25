package homework;

/**
 * Абстрактный класс ДЗ реализующий интерфейс RunnableHomework и общие для таких ДЗ поля и методы.
 *
 * @author Gnitko Andrei
 * @see RunnableHomework
 * @see AbstractHomework
 */
public abstract class AbstractRunnableHomework extends AbstractHomework implements RunnableHomework {

    /**
     * Количество заданий в ДЗ.
     */
    private static int tasksAmount;

    /**
     * Переопределённый метод с сообщением для ввода номеров исполняемых заданий.
     */
    @Override
    public void printWelcomeMessage() {
        System.out.printf("Задания занятия №%d %s\n", number, name);
        int amount = HomeworkNames.getAmount();
        System.out.printf("Введите номер задания от 1 до %d (можно несколько в формате 1-%d или 1 2 3...)\n", tasksAmount, tasksAmount);
        System.out.println("для завершения ввода напишите exit");
    }

    /**
     * Реализация метода для запуска выполнения конкретных заданий.
     *
     * @throws InvalidTaskNumberException
     * @see RunnableHomework#runTask()
     */
    @Override
    public void runTask() throws InvalidTaskNumberException {
        Runner runner = new Runner();
        printWelcomeMessage();
        int[] numbers = runner.readHWNumbers();
        if (numbers != null) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Task №" + numbers[i]);
                chooseTask(numbers[i]);
            }
        }
    }

    /**
     * Абстрактный метод для запуска выполнения конкретного задания по номеру.
     *
     * @param number - номер задания
     * @throws InvalidTaskNumberException
     */
    public abstract void chooseTask(int number) throws InvalidTaskNumberException;

    /**
     * Геттер для количества заданий.
     *
     * @return количество заданий ДЗ
     * @see AbstractRunnableHomework#tasksAmount
     */
    public static int getTasksAmount() {
        return tasksAmount;
    }

    /**
     * Сеттер для количества заданий.
     *
     * @param tasksAmount количество заданий ДЗ
     * @see AbstractRunnableHomework#tasksAmount
     */
    public static void setTasksAmount(int tasksAmount) {
        AbstractRunnableHomework.tasksAmount = tasksAmount;
    }


}
