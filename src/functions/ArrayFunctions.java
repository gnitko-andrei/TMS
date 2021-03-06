package functions;

import java.util.Random;

public class ArrayFunctions {
    public ArrayFunctions() {
    }

    public static int[] arrayRandomGeneration(int length) {
        int[] arr = new int[length];
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt();
        }

        return arr;
    }

    public static Integer[] arrayIntegerRandomGeneration(int length) {
        Integer[] arr = new Integer[length];
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt();
        }

        return arr;
    }

    public static double[] arrayDoubleRandomGeneration(int length) {
        double[] arr = new double[length];
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextDouble();
        }

        return arr;
    }

    public static int[] arrayRandomGenerationLimited(int length, int bound) {
        int[] arr = new int[length];
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt(bound);
        }

        return arr;
    }

    public static int[][] arrayRandomGeneration(int x, int y) {
        int[][] arr = new int[x][y];
        Random r = new Random();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = r.nextInt(100);
            }
        }

        return arr;
    }

    public static int[][] arrayRandomGenerationLimited(int x, int y, int bound) {
        int[][] arr = new int[x][y];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(bound);
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void printArray(Integer[] arr) {
        for (Integer element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.println(element + " ");
        }

        System.out.println();
    }

    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.println(element + " ");
        }

        System.out.println();
    }

    public static void printArray(int[][] arr) {
        for (int[] oneDArray : arr) {
            for (int element : oneDArray) {
                System.out.print(element + " ");
            }

            System.out.println();
        }

    }

    public static double averageArray(int[] arr) {
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }

        return (double) (sum / arr.length);
    }
}
