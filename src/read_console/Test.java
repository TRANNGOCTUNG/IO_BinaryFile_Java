package read_console;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(i -> i % 2 == 0)
                .limit(2)
                .forEach(i -> System.out.println(i + " "));


        Stream.of(1,2,3,4,5,6,7,8)
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(i -> System.out.println(i + " "));

    }
}
