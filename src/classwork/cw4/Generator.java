package classwork.cw4;

public class Generator {
    public Generator() {
    }

    public static void main(String[] args) {
        Notebook nb = new Notebook(10, 5, "NONAME");
        nb.setRam(6);
        System.out.println(nb.toString());
    }
}
