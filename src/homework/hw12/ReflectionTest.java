package homework.hw12;

public class ReflectionTest {
    private int id;
    private String name;
    private String name2;
    private boolean bb;
    private int i;
    private boolean b;
    private static int st = 33;
    private final int fin = 331;

    private void privatePrint() {
        System.out.println("Private print");
    }

    public static int getSt() {
        return st;
    }

    @Override
    public String toString() {
        return "ReflectionTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", name2='" + name2 + '\'' +
                ", bb=" + bb +
                ", i=" + i +
                ", b=" + b +
                ", fin=" + fin +
                '}';
    }
}
