package homework;

import homework.hw1.HW1;
import homework.hw2.HW2;
import homework.hw3.HW3;

import java.util.Scanner;

public class Runner {

    private int homeworksAmount = HomeworkNames.getAmount();
    public static void main(String[] args) throws InvalidHomeworkNumberException {
        Runner runner = new Runner();
        runner.runHW();
    }

    private void runHW() throws InvalidHomeworkNumberException {
        printWelcomeMessage();
        int[] numbers = readHWNumbers();
        boolean isValid = checkNumbers(numbers, homeworksAmount);
        if (isValid) {
            for (int i = 0; i < numbers.length; i++) {
                switch (numbers[i]) {
                    case 1: {
                        HW1 hw = new HW1();
                        hw.runTask();
                        break;
                    }
                    case 2: {
                        HW2 hw = new HW2();
                        hw.runTask();
                        break;
                    }
                    case 3: {
                        HW3 hw = new HW3();
                        hw.runTask();
                        break;
                    }
                    case 4: {
                        System.out.println("Задание занятия №4 заключалось  написании данного класса");
                        break;
                    }
                    case 5: {
                        System.out.println("Задание занятия №5 не исполняется и находится в пакете Homework.hw5");
                    }
                }
            }
        }

    }

    private void printWelcomeMessage() {
        int amount = HomeworkNames.getAmount();
        System.out.printf("Введите номер задания от 1 до %d (можно несколько в формате 1-%d или 1 2 3...)\n", amount, amount);
        for (HomeworkNames value : HomeworkNames.values()) {
            System.out.printf("%d. %s", value.getNumber(), value.getName());
            if(value.getNumber() < homeworksAmount
                    && value.getNumber() != homeworksAmount/2) {
                System.out.print(", ");
            } else System.out.println(".");
        }
        System.out.println("для завершения ввода напишите exit");
    }

    public int[] readHWNumbers() {
        Scanner sc = new Scanner(System.in, "UTF-8");
        String numbersString = "";
        while (sc.hasNext()) {
            String nextValue = sc.next();
            if (nextValue.equalsIgnoreCase("exit")) {
                break;
            }
            numbersString += nextValue + " ";
        }
        int[] numbers = findNumbersFromString(numbersString);
        return numbers;
    }

    private int[] findNumbersFromString(String numbersString) {
        if(numbersString.isEmpty())
        {
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

    public boolean checkNumbers(int[] numbers, int amount) {
        if(numbers == null)
        {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > amount) {
                System.out.println("неправильный номер задания");
                return false;
            }
        }
        return true;
    }
}
