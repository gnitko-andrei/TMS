package Functions;

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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static double averageArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) (sum / arr.length);
    }
}
