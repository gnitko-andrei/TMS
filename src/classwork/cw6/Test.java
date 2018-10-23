package classwork.cw6;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "1234567890";
        int i = s.indexOf('1');
        int n = s.indexOf("678");
        System.out.println(i + " " + n);

        String a = "123";
        String b = "123" + "";
        b.intern();
        System.out.println(a == b);

        System.out.println(s.charAt(5));

        System.out.println(s.substring(4,7));

        String s1 = "11 2 3 4 5";
        System.out.println(s1.trim());
        System.out.println(Arrays.deepToString(s1.split("\\s")));
        System.out.println("Hello world".replace("Hello", "Goodbye"));
        System.out.println("Hello        world".replaceAll("\\s+", " "));
        System.out.println("sdfdsg1d2432fwf4534".replaceAll("\\d", ""));
        System.out.println("abcdefg".equalsIgnoreCase("abcdefg"));
        String sss = "1234";
        sss = sss.concat("5678");
        System.out.println(sss);
        System.out.println(sss.concat("5678"));

    }
}
