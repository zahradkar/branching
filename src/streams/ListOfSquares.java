package streams;

import java.util.Arrays;
import java.util.List;

public class ListOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().filter(x -> x > 0).map(x -> x * x).forEach(System.out::println);

        List<Integer> expectedOutput = Arrays.asList(1, 9, 144, 361, 36, 81, 100, 196);
    }
}
