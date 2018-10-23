package homework;

import homework.hw1.HW1;
import homework.hw2.HW2;
import homework.hw3.HW3;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.runHW();
    }

    private void runHW() {
        printWelcomeMessage();
        int[] numbers = readHWNumbers();
        boolean isValid = checkNumbers(numbers, 5);
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
        System.out.println("Введите номер занятия (можно несколько в формате 1-4 или 1 2 3...)");
        System.out.println("1.Intro, 2.Control flows, 3.Arrays, 4.Class, 5. Interface");
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
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > amount) {
                System.out.println("неправильный номер задания");
                return false;
            }
        }
        return true;
    }
}
