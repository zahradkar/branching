package streams2;

import java.util.Arrays;
import java.util.List;

// Write a method to return the sum of odd numbers in the list of integers below using the Stream API.
public class Ex5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println(numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum));

        // int expectedOutput = 61;
    }
}
