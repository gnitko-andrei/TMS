package homework.hw3;

import functions.ArrayFunctions;

/**
 * Tasks 9
 * Создать массив вещественных чисел, в качестве размерности используя значение, введенное через program arguments.
 * Проверить 1й знак после запятой, если он меньше 3, то вывести “[0, 3]”, от 3 до 6 - “[3, 6]”, от 6 до 9 - “[6,9]”.
 * Сделать двумя способами.
 */

public class Task9 {

    public static void main(String[] args) {
        System.out.println("Tasks 9");
        double[] arr = ArrayFunctions.arrayDoubleRandomGeneration(Integer.parseInt(args[0]));
        ArrayFunctions.printArray(arr);
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] * 10 < 3) {
                System.out.println("[0, 3]");
            } else if (arr[i] * 10 < 6) {
                System.out.println("[3, 6]");
            } else if ( arr[i] * 10 <= 10) {
                System.out.println("[6, 9]");
            }
        }

    }
}
