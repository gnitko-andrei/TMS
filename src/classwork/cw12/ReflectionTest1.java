package classwork.cw12;

public class ReflectionTest1 {
    private int id;
    private String name;
    private String name2;
    private boolean bb;
    private int i;
    private boolean b;
    private static int st = 33;

    private void privatePrint() {
        System.out.println("Private print");
    }

    @Override
    public String toString() {
        return "ReflectionTest1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", name2='" + name2 + '\'' +
                ", bb=" + bb +
                ", i=" + i +
                ", b=" + b +
                '}';
    }
}
