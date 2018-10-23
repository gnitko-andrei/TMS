package classwork.cw3;

import java.util.Arrays;

public class Lesson3b {
    public Lesson3b() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 4, 7, 5};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = Arrays.copyOfRange(arr, 1, 5);
        System.out.println(Arrays.toString(arr1));
        boolean[] arrb = new boolean[5];
        boolean[] arrb1 = Arrays.copyOfRange(arrb, 1, 5);
        System.out.println(Arrays.toString(arrb1));
        String[] arrs = new String[5];
        String[] arrs1 = (String[])Arrays.copyOfRange(arrs, 1, 5);
        System.out.println(Arrays.toString(arrs1));
        int[] arr4 = new int[]{2, 1, 3, 4, 7, 5, 2, 4, 6, 4};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.binarySearch(arr4, 2));
        System.out.println(Arrays.binarySearch(arr4, 3));
        System.out.println(Arrays.binarySearch(arr4, 5));
        System.out.println(Arrays.binarySearch(arr4, 7));
        int[] arr5 = new int[5];
        Arrays.fill(arr5, 5);
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.compare(arr5, arr));
    }
}