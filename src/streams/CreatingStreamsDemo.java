package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        /*
        Collection<Integer> x;
        x.stream()
        znamea,ze
        var list = new ArrayList<>();
        list.stream() - return stream of list
*/
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers) // return stream of numbers
                .forEach(n -> System.out.println(n)); // iterates over the stream and can get each object

        var stream = Stream.generate(() -> Math.random());
        stream
                .limit(3)
                .forEach(n -> System.out.println(n));

        Stream.iterate(1, n -> +1)
                .limit(10)
                .forEach(n -> System.out.println(n));
    }
}
