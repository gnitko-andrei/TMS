package ClassWork.CW3;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomGeneration {
    public ArrayRandomGeneration() {
    }

    public static void main(String[] args) {
        int[] arr = generateArray(7);
        System.out.println(Arrays.toString(arr));
        int[][] arr1 = generateArray(5, 10);
        System.out.println(Arrays.deepToString(arr1));
    }

    public static int[] generateArray(int length) {
        int[] arr = new int[length];
        Random r = new Random();

        for(int i = 0; i < length; ++i) {
            arr[i] = r.nextInt(10);
        }

        return arr;
    }

    public static int[][] generateArray(int length, int width) {
        int[][] arr = new int[length][width];
        Random r = new Random();

        for(int i = 0; i < length; ++i) {
            for(int j = 0; j < width; ++j) {
                arr[i][j] = r.nextInt(10);
            }
        }

        return arr;
    }
}

