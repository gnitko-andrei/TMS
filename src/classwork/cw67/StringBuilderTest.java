package classwork.cw67;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("123456");
        sb.insert(2, ".");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.append("345");
        System.out.println(sb);

    }

}
