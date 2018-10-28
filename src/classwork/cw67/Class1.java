package classwork.cw67;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Class1 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.exceptions();

    }

    private void exceptions() {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("IO");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OutOfBounds");
            System.exit(1);   // finaly не выполняется
        } finally {
            System.out.println("finaly");
        }
    }
}
