package read_console;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSkipLimit {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i+=10) {
            List<Integer> list = getEventNumbers(i,10);
            System.out.println(list);

        }
    }
    public static List<Integer> getEventNumbers(int offset, int limit) {
        return Stream.iterate(0,i -> i + 1)
                .filter(i -> i % 2 == 0)
                .skip(offset)
                .limit(limit)
                .collect(Collectors.toList());
    }
}
