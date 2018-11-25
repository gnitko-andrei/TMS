package homework;

import homework.hw1.HW1;
import homework.hw2.HW2;
import homework.hw3.HW3;
import homework.hw4.HW4;
import homework.hw5.HW5;
import homework.hw6.HW6;
import homework.hw7.HW7;
import homework.hw8.HW8;
import homework.hw9.HW9;

import java.util.Scanner;

/**
 * Класс для запуска ДЗ
 *
 * @author Gnitko Andrei
 */
public class Runner {
    /**
     * Количество заданий ДЗ
     *
     * @see HomeworkNames#getAmount()
     */
    private int homeworksAmount = HomeworkNames.getAmount();

    public static void main(String[] args) throws InvalidHomeworkNumberException, InvalidTaskNumberException {
        Runner runner = new Runner();
        runner.runHW();
    }

    /**
     * Метод выводит приветственное сообщение, считывает с консоли номера ДЗ и запускает их выполнение.
     * При вводе пустой строки выполнение не запускается.
     *
     * @throws InvalidHomeworkNumberException исключение выбрасывается в случае несовпаденя номера ДЗ с перечисленными в блоке switch
     * @throws InvalidHomeworkNumberException
     * @throws InvalidTaskNumberException
     * @see Runner#printWelcomeMessage()
     * @see Runner#readHWNumbers()
     */
    private void runHW() throws InvalidHomeworkNumberException, InvalidTaskNumberException {
        printWelcomeMessage();
        int[] numbers = readHWNumbers();
        if (numbers != null) {
            for (int number : numbers) {
                switch (number) {
                    case 1: {
                        AbstractHomework hw = new HW1();
                        runTasks(hw);
                        break;
                    }
                    case 2: {
                        AbstractHomework hw = new HW2();
                        runTasks(hw);
                        break;
                    }
                    case 3: {
                        AbstractHomework hw = new HW3();
                        runTasks(hw);
                        break;
                    }
                    case 4: {
                        AbstractHomework hw = new HW4();
                        runTasks(hw);
                        break;
                    }
                    case 5: {
                        AbstractHomework hw = new HW5();
                        runTasks(hw);
                        break;
                    }
                    case 6: {
                        AbstractHomework hw = new HW6();
                        runTasks(hw);
                        break;
                    }
                    case 7: {
                        AbstractHomework hw = new HW7();
                        runTasks(hw);
                        break;
                    }
                    case 8: {
                        AbstractHomework hw = new HW8();
                        runTasks(hw);
                        break;
                    }
                    case 9: {
                        AbstractHomework hw = new HW9();
                        runTasks(hw);
                        break;
                    }
                    default: {
                        throw new InvalidHomeworkNumberException("ДЗ с номером " + number + " не существует");
                    }
                }
            }
        }
    }

    /**
     * Метод проверки ДЗ на реализацию интерфейса RunnableHomework и необходимость запуска, соответственно.
     * Для объектов реализующих интерфейс RunnableHomework запускает исполнение заданий runTask.
     * Для объектов не реализующих интерфейс RunnableHomework выводит приветственное сообщение.
     *
     * @param homework объект ДЗ
     * @throws InvalidTaskNumberException
     * @see AbstractHomework
     * @see AbstractRunnableHomework
     */
    private void runTasks(AbstractHomework homework) throws InvalidTaskNumberException {
        if (homework instanceof AbstractRunnableHomework) {
            ((AbstractRunnableHomework) homework).runTask();
        } else homework.printWelcomeMessage();
    }

    /**
     * Метод выводит приветственное сообщение.
     */
    private void printWelcomeMessage() {
        int amount = HomeworkNames.getAmount();
        System.out.printf("Введите номер задания от 1 до %d (можно несколько в формате 1-%d или 1 2 3...)\n", amount, amount);
        for (HomeworkNames value : HomeworkNames.values()) {
            System.out.printf("%d. %s", value.getNumber(), value.getName());
            if (value.getNumber() < homeworksAmount
                    && value.getNumber() != homeworksAmount / 2) {
                System.out.print(", ");
            } else System.out.println(".");
        }
        System.out.println("для завершения ввода напишите exit");
    }

    /**
     * Метод считывает с консоли номера ДЗ.
     *
     * @return массив считанных номеров
     * @see Runner#findNumbersFromString(String)
     */
    int[] readHWNumbers() {
        Scanner sc = new Scanner(System.in);
        StringBuilder numbersString = new StringBuilder();
        while (sc.hasNext()) {
            String nextValue = sc.next();
            if (nextValue.equalsIgnoreCase("exit")) {
                break;
            }
            numbersString.append(nextValue).append(" ");
        }
        return findNumbersFromString(numbersString.toString());
    }

    /**
     * Метод, преобразующий строку с номерами ДЗ в массив номеров, в случае пустой строки возвращает null.
     *
     * @param numbersString строка, содержащая номера заданий
     * @return массив считанных номеров
     */
    private int[] findNumbersFromString(String numbersString) {
        if (numbersString.isEmpty()) {
            return null;
        }
        String[] stringNumbersArray;
        int[] numbers;
        if (numbersString.contains("-")) {
            stringNumbersArray = numbersString.split("[-\\s+]");
            int first = Integer.parseInt(stringNumbersArray[0]);
            int last = Integer.parseInt(stringNumbersArray[1]);
            numbers = new int[last - first + 1];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = first + i;
            }
        } else {
            stringNumbersArray = numbersString.split("\\s+");
            numbers = new int[stringNumbersArray.length];
            for (int i = 0; i < stringNumbersArray.length; i++) {
                numbers[i] = Integer.parseInt(stringNumbersArray[i]);
            }
        }
        return numbers;
    }
}
