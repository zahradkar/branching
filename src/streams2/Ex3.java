package streams2;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers.stream().filter(m -> m * m > 20).forEach(System.out::println);
//        List<Integer> expectedOutput = Arrays.asList(9, 8, 6, 5);
    }
}
