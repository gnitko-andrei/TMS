package homework.hw2;

import functions.ArrayFunctions;
import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;

/**
 * Класс содержащий ДЗ №2.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW2 extends AbstractRunnableHomework {

    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW2() throws InvalidHomeworkNumberException {
        setTasksAmount(6);
        initialize(2);
    }


    /**
     * @param number - номер задания
     * @throws InvalidTaskNumberException исключение выбрасывается в случае несовпаденя номера задания с перечисленными в блоке switch
     */
    @Override
    public void chooseTask(int number) throws InvalidTaskNumberException {
        switch (number) {
            case 1: {
                this.task1();
                break;
            }
            case 2: {
                this.task2();
                break;
            }
            case 3: {
                this.task3();
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
            default: {
                throw new InvalidTaskNumberException(number + " неправильный номер задания");
            }
        }
        System.out.println();
    }

    /**
     * Tasks 1
     * Есть массив со значениями {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}. Найти число 7, вывести и выйти (break;) из цикла.
     */
    private void task1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int arrElement : arr) {
            if (arrElement == 7) {
                System.out.println(arrElement);
                break;
            }
        }
    }

    /**
     * Tasks 2
     * Есть массив из 10 элементов. Заполнить рандомными значениями.
     * В каждой итерации выводить индекс массива. Вывести числа, которые делятся на 3.
     */
    private void task2() {
        int[] arr = ArrayFunctions.arrayRandomGeneration(10);
        ArrayFunctions.printArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i] + "делится на 3");
            }
        }

    }

    /**
     * Tasks 3
     * Повторить задание 2 с использованием while.
     */
    private void task3() {
        int[] arr = ArrayFunctions.arrayRandomGeneration(10);
        ArrayFunctions.printArray(arr);
        int i = 0;
        while (i < arr.length) {
            System.out.println("i = " + i);
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i] + "делится на 3");
            }
            i++;
        }
    }

    /**
     * Tasks 4
     * Объявить 2-мерный массив 10x8, как только находится элемент,
     * который делится на 4, вывести его и перейти на следующую строку.
     * Пример:				Вывод в консоль
     * 1 2 3 4 5 6 7 8 9 10			1 2 3 4...
     * 2 3 4 5 6 7 …				2 3 4...
     * 3 4 5 6 …				3 4...
     * …					...
     * 4 7 4 …				4
     */
    private void task4() {
        int[][] arr = ArrayFunctions.arrayRandomGeneration(10, 8);
        ArrayFunctions.printArray(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] % 4 == 0) {
                    break;
                }
            }
            System.out.println();
        }
    }

    /**
     * Tasks 5
     * Объявить 2-мерный массив 5x5, заполнить 0 и 1, затем взять каждую строку и преобразовать в 10-тичную систему.
     * Пример:	Вывод
     * 01010		10
     * 10100		20
     * 00000		0
     * 00011		3
     * 10111		23
     */
    private void task5() {
        int[][] arr = ArrayFunctions.arrayRandomGenerationLimited(5, 5, 2);
        ArrayFunctions.printArray(arr);
        for (int i = 0; i < 5; i++) {
            String s = "";
            int n = 0;
            for (int j = 0; j < 5; j++) {
                s += arr[i][j];
                n += Math.pow(2, 4 - j) * arr[i][j];
            }
            System.out.println(s + " = " + n);
        }
    }

    /**
     * Tasks 6
     * Есть массив 5х5. Вывести элемент в позиции [0,0]; [2,2]; [4,4].
     */
    private void task6() {
        int[][] arr = ArrayFunctions.arrayRandomGeneration(5, 5);
        ArrayFunctions.printArray(arr);
        System.out.println(arr[0][0]);
        System.out.println(arr[2][2]);
        System.out.println(arr[4][4]);
    }
}
