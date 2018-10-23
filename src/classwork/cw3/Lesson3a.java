package classwork.cw3;

import java.util.Arrays;
import java.util.Random;

public class Lesson3a {
    public Lesson3a() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        int[][] arr1 = new int[10][10];
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                arr1[i][j] = r.nextInt(10);
            }
        }

        System.out.println(Arrays.deepToString(arr1));
        int[] arr2 = Arrays.copyOfRange(arr, 3, 5);
        System.out.println(Arrays.toString(arr2));
    }
}