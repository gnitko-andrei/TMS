package classwork.cw12;

import java.util.ArrayList;

public class ReflectionTest {
    private int id;
    private String name;

    private void privatePrint() {
        System.out.println("Private print");
    }

    @Override
    public String toString() {
        return "ReflectionTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
