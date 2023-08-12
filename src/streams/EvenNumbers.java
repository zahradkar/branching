package streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        numbers.stream().filter(x -> (x & 1) == 0).forEach(System.out::println);
//        List<Integer> expectedOutput = Arrays.asList(-2, -4, -8, 12, 6, 10, 14);
    }
}
