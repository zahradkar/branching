package streams;

import java.util.Arrays;
import java.util.List;

public class AverageOfOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().filter(x -> (x & 1) != 0).mapToInt(Integer::intValue).average().ifPresent(avg -> System.out.println(avg));
        double expectedOutput = 22.0 / 6.0;
    }
}
