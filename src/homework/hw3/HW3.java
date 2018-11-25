package homework.hw3;

import functions.ArrayFunctions;
import functions.Converter;
import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;

import java.util.Arrays;

/**
 * Класс содержащий ДЗ №3.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW3 extends AbstractRunnableHomework {

    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW3() throws InvalidHomeworkNumberException {
        setTasksAmount(12);
        initialize(3);
    }

    /**
     * @param number - номер задания
     * @throws InvalidTaskNumberException исключение выбрасывается в случае несовпаденя номера задания с перечисленными в блоке switch
     */
    @Override
    public void chooseTask(int number) throws InvalidTaskNumberException {
        switch (number) {
            case 1: {
                System.out.println("рефакторинг предыдущих заданий");
                break;
            }
            case 2: {
                this.task2();
                break;
            }
            case 3: {
                System.out.println("выполняется в классе Homework.hw3.Task3\n" +
                        "и нуждается в задании необходимых параметров через program arguments");
                break;
            }
            case 4: {
                this.task4();
                break;
            }
            case 5: {
                this.task5();
                break;
            }
            case 6: {
                this.task6();
                break;
            }
            case 7: {
                this.task7();
                break;
            }
            case 8: {
                this.task8();
                break;
            }
            case 9: {
                System.out.println("выполняется в классе Homework.hw3.Task9\n" +
                        "и нуждается в задании необходимых параметров через program arguments");
                break;
            }
            case 10: {
                System.out.println("заднание №5 из занятия №2");
                break;
            }
            case 11: {
                this.task11();
                break;
            }
            case 12: {
                this.task12();
                break;
            }
            default: {
                throw new InvalidTaskNumberException(number + " неправильный номер задания");
            }
        }
        System.out.println();
    }

    /**
     * Tasks 2
     * Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
     * для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см.
     */
    private void task2() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " д. = " + Converter.inchToCentimeter(i) + " см.");
        }

    }

    /**
     * Tasks 4
     * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
     * отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
     * Массив заполните, используя цикл, также рассчитайте его размер (вычислить).
     */
    private void task4() {
        int length = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                ++length;
            }
        }
        int[] arr = new int[length];
        int n = arr.length;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                arr[arr.length - n] = i;
                --n;
            }
        }
        ArrayFunctions.printArray(arr);
        for (int element : arr) {
            System.out.println(element);
        }
    }

    /**
     * Tasks 5
     * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
     * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
     */
    private void task5() {
        int length = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                ++length;
            }
        }
        int[] arr = new int[length];
        int n = arr.length;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                arr[arr.length - n] = i;
                --n;
            }
        }
        ArrayFunctions.printArray(arr);
        for (int i = arr.length; i > 0; i--) {
            System.out.print(arr[i - 1] + " ");
        }
        System.out.println();
    }

    /**
     * Tasks 6
     * Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран.
     * Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
     */
    private void task6() {
        int[] arr = ArrayFunctions.arrayRandomGenerationLimited(15, 99);
        ArrayFunctions.printArray(arr);
        int n = 0;

        for (int element : arr) {
            if (element % 2 == 0) {
                ++n;
            }
        }
        System.out.println(n + " чётных элементов");
    }

    /**
     * Tasks 7
     * Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите массив на экран в строку.
     * Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
     * Дополнительно выведите количество замененных элементов (Were replaced N elements, где N - ваш ответ).
     */
    private void task7() {
        int[] arr = ArrayFunctions.arrayRandomGenerationLimited(20, 20);
        ArrayFunctions.printArray(arr);
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                if (arr[i] != 0) {
                    arr[i] = 0;
                    n++;
                }
            }
        }
        ArrayFunctions.printArray(arr);
        System.out.println("Were replaced N elements, где N = " + n);
    }

    /**
     * Tasks 8
     * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
     * выведите массивы на экран в двух отдельных строках.
     * Посчитайте среднее арифметическое элементов каждого массива и сообщите,
     * для какого из массивов это значение оказалось больше
     * (либо сообщите, что их средние арифметические равны).
     */
    private void task8() {
        int[] arr1 = ArrayFunctions.arrayRandomGenerationLimited(5, 15);
        int[] arr2 = ArrayFunctions.arrayRandomGenerationLimited(5, 15);
        ArrayFunctions.printArray(arr1);
        ArrayFunctions.printArray(arr2);
        double average1 = ArrayFunctions.averageArray(arr1);
        double average2 = ArrayFunctions.averageArray(arr2);
        System.out.println(average1 + " " + average2);
        if (average1 == average2) {
            System.out.println("Средние арифметические равны");
        } else if (average1 > average2) {
            System.out.println("Average№1 > Average№2");
        } else if (average1 < average2) {
            System.out.println("Average№1 < Average№2");
        }
    }

    /**
     * Tasks 11
     * Создать массив со случайными числами от 5 до 15. Используя функцию поиска, найти в нем 7, 9, 10.
     * Вывести индексы. Если не найдено, то вывести “Element with value N not found”, где N - искомое число.
     */
    private void task11() {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 5);
        }
        Arrays.sort(arr);
        ArrayFunctions.printArray(arr);
        searchValue(arr, 7);
        searchValue(arr, 9);
        searchValue(arr, 10);
    }

    /**
     * Метод поиска элемента массива по значению и вывода его индекса.
     *
     * @param arr массив для поиска
     * @param i   искомое значение
     */
    private void searchValue(int[] arr, int i) {
        int n = Arrays.binarySearch(arr, i);
        if (n >= 0) {
            System.out.printf("Index of %d is %d\n", i, n);
        } else {
            System.out.println("Element with value " + i + " not found");
        }
    }

    /**
     * Tasks 12
     * Создать 2мерный массив размерностью 10х10, заполнить случайными значениями в диапазоне [3, 33].
     * Сгенерировать значение из того же диапазона, вывести его в случае нахождения и выйти из цикла.
     * Если не найден,уведомить об этом. Повторить весь алгоритм 3 раза.
     */
    private void task12() {
        for (int reiteration = 1; reiteration <= 3; reiteration++) {
            System.out.println("Итерация №" + reiteration);
            int[][] arr = ArrayFunctions.arrayRandomGenerationLimited(10, 10, 30);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][i] += 3;
                }
            }
            ArrayFunctions.printArray(arr);
            boolean isFound = false;
            int n = (int) (Math.random() * 30 + 3);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == n) {
                        System.out.println(n);
                        isFound = true;
                        break;
                    }
                }
                if (isFound) {
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Элемент не найден");
            }
        }

    }
}
