package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a method to return a list of uppercase characters from a given string using the Stream API.
public class Ex6 {
    public static void main(String[] args) {
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
        s.chars().filter(x -> x >= 65 && x <= 90).forEach(x-> System.out.print((char) x+","));
        List<Character> expectedOutput = Arrays.asList('L', 'I', 'D', 'S', 'A', 'C', 'A', 'E', 'M');
    }

    public static List<Character> extractUppercaseCharacters(String input) {
        return input.chars()  // Convert the string to an IntStream of character codes
                .filter(Character::isUpperCase)  // Filter for uppercase characters
                .mapToObj(ch -> (char) ch)  // Convert character codes back to characters
                .collect(Collectors.toList());  // Collect characters into a list
    }
}
