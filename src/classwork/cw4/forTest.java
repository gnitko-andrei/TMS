package classwork.cw4;

import java.util.Scanner;

public class forTest {
    public forTest() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        while(sc.hasNext()) {
            String nextValue = sc.next();
            if (nextValue.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println(nextValue.toUpperCase());
        }

    }
}