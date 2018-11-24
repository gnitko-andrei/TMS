package homework;

public abstract class AbstractRunnableHomework extends AbstractHomework implements RunnableHomework {

    private static int tasksAmount;

    @Override
    public void printWelcomeMessage() {
        System.out.printf("Задания занятия №%d %s\n", number, name);
        int amount = HomeworkNames.getAmount();
        System.out.printf("Введите номер задания от 1 до %d (можно несколько в формате 1-%d или 1 2 3...)\n", tasksAmount, tasksAmount);
        System.out.println("для завершения ввода напишите exit");
    }

    public void runTask() throws InvalidTaskNumberException {
        Runner runner = new Runner();
        printWelcomeMessage();
        int[] numbers = runner.readHWNumbers();
        if (numbers != null) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Task №" + numbers[i]);
                chooseTask(numbers, i);
            }
        }
    }

    public abstract void chooseTask(int[] numbers, int i) throws InvalidTaskNumberException;

    public static int getTasksAmount() {
        return tasksAmount;
    }

    public static void setTasksAmount(int tasksAmount) {
        AbstractRunnableHomework.tasksAmount = tasksAmount;
    }


}
