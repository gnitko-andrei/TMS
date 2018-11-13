package classwork.cw10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class CW {

    public static void main(String[] args) {
        CW cw = new CW();
        cw.streams();
    }

    private static void lambdas() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonimous");
            }
        }).start();

        new Thread(
                () -> System.out.println("lambda")
        ).start();

        Collections.sort(Arrays.asList(1, 3, 5), (Integer a, Integer b) -> b > a ? 1 : -1);

        Collections.sort(
                Arrays.asList(1, 3, 5),
                (o1, o2) -> o2 > o1 ? 1 : -1
        );

        Arrays.asList(1, 3, 5).forEach(System.out::println);
        Arrays.asList(1, 3, 5).forEach(Test::new);

        int[] offset = {5};
        new Thread(() -> offset[0]++);
    }

    private void streams() {
        List<Integer> numbers = Arrays.asList(1, 3, 2, -6, -5, -10, 14);

        System.out.println("test");
        System.out.println(numbers.stream()
                .peek(System.out::println)
                .filter(n -> n % 2 == 1));

        System.out.println("odd");
        System.out.println(numbers.stream()
                .filter(n -> n % 2 == 1)
                .collect(toList()));

        System.out.println("max");
        System.out.println(numbers.stream()
                .max((a, b) -> a == b ? 0 : (a > b ? 1 : -1))
                .get());

        System.out.println("skip and find negatives");
        System.out.println(numbers.stream()
                .skip(2)
                .filter(n -> n < 0)
                .collect(toList()));

        System.out.println("== -5");
        System.out.println(numbers.stream()
                .peek(System.out::println)
                .filter(n -> n == -5)
                .findAny());

        System.out.println("parallel == -5");
        System.out.println(numbers.parallelStream()
                .peek(System.out::println)
                .filter(n -> n == -5)
                .findAny());

        System.out.println("parallel skip and find negatives");
        System.out.println(numbers.parallelStream()
                .peek(System.out::println)
                .skip(2)
                .filter(n -> n < 0)
                .collect(toList()));


        System.out.println("map");
        System.out.println(numbers.stream()
                .map(Test::new)
                .collect(toList()));

        System.out.println("toMap");
        System.out.println(numbers.stream()
                .map(Test::new)
                .collect(toMap(Test::getId, Function.identity())));
    }
}

class Test {

    int id;

    public int getId() {
        return id;
    }

    public Test(Integer i) {

    }
}
