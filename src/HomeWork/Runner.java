package HomeWork;

import HomeWork.HW1.HW1;
import HomeWork.HW2.HW2;
import HomeWork.HW3.HW3;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Runner run = new Runner();
        run.run();
    }

    private void run() {
        welcomeMessage();
        int[] numbers = readHWNumbers();
        boolean checkNumbers = checkNumbers(numbers, 5);
        if (checkNumbers) {
            for (int i = 0; i < numbers.length; i++) {
                switch (numbers[i]) {
                    case 1: {
                        HW1 hw = new HW1();
                        hw.run();
                        break;
                    }
                    case 2: {
                        HW2 hw = new HW2();
                        hw.run();
                        break;
                    }
                    case 3: {
                        HW3 hw = new HW3();
                        hw.run();
                        break;
                    }
                    case 4: {
                        System.out.println("Задание занятия №4 заключалось  написании данного класса");
                        break;
                    }
                    case 5: {
                        System.out.println("Задание занятия №5 не исполняется и находится в пакете Homework.HW5");
                    }
                }
            }
        }

    }

    private void welcomeMessage() {
        System.out.println("Введите номер занятия (можно несколько в формате 1-4 или 1 2 3...)");
        System.out.println("1.Intro, 2.Control flows, 3.Arrays, 4.Class, 5. Interface");
        System.out.println("для завершения ввода напишите exit");
    }

    public int[] readHWNumbers() {
        Scanner sc = new Scanner(System.in, "UTF-8");
        String s = "";
        while (sc.hasNext()) {
            String nextValue = sc.next();
            if (nextValue.equalsIgnoreCase("exit")) {
                break;
            }
            s += nextValue + " ";
        }
        int[] numbers = findNumbersFromString(s);
        return numbers;

    }

    private int[] findNumbersFromString(String s) {
        String[] stringNumbers;
        int[] numbers;
        if (s.contains("-")) {
            stringNumbers = s.split("[-\\s+]");
            int first = Integer.parseInt(stringNumbers[0]);
            int last = Integer.parseInt(stringNumbers[1]);
            numbers = new int[last - first + 1];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = first + i;
            }
        } else {
            stringNumbers = s.split("\\s+");
            numbers = new int[stringNumbers.length];
            for (int i = 0; i < stringNumbers.length; i++) {
                numbers[i] = Integer.parseInt(stringNumbers[i]);
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
