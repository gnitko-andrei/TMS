package homework.hw3;

import functions.ArrayFunctions;

/**
 * Tasks 3
 * В качестве размера массива используйте значение,
 * введенное через IDEA (program arguments). Заполнить массив строкой “Hello World”.
 */
public class Task3 {

    public static void main(String[] args) {
        System.out.println("Task 3");
        int length = Integer.parseInt(args[0]);
        String[] arr = new String[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "Hello World";
        }
        ArrayFunctions.printArray(arr);
    }
}
