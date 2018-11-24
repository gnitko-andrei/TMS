package homework;

import homework.hw1.HW1;
import homework.hw2.HW2;
import homework.hw3.HW3;
import homework.hw4.HW4;
import homework.hw5.HW5;
import homework.hw6.HW6;

import java.util.Scanner;

public class Runner {

    private int homeworksAmount = HomeworkNames.getAmount();

    public static void main(String[] args) throws InvalidHomeworkNumberException, InvalidTaskNumberException {
        Runner runner = new Runner();
        runner.runHW();
    }

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
                    default: {
                        throw new InvalidHomeworkNumberException("ДЗ с номером " + number + " не существует");
                    }
                }
            }
        }


    }

    private void runTasks(AbstractHomework homework) throws InvalidTaskNumberException {
        if (homework instanceof AbstractRunnableHomework) {
            ((AbstractRunnableHomework) homework).runTask();
        } else homework.printWelcomeMessage();
    }

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
