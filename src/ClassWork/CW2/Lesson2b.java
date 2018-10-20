package ClassWork.CW2;

import java.util.Random;

public class Lesson2b {
    public Lesson2b() {
    }

    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = r.nextInt(10);
            System.out.println(arr[i]);
        }

        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < arr3.length; ++i) {
            String s = arr3[i] % 2 == 0 ? " чёт" : " нечёт";
            System.out.println(s);
        }

    }
}
