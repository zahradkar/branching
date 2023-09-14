package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// ...return a string concatenated from a given list of characters...
public class Ex8 {
    public static void main(String[] args) {
        List<Character> characters = Arrays.asList('L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm');
        System.out.println(characters);
        String expectedOutput = "Lorem ipsum";
    }

    public static String concatenateCharacters(List<Character> characters) {
        return characters.stream()  // Convert the list to a Stream<Character>
                .map(String::valueOf)  // Convert each character to a String
                .collect(Collectors.joining());  // Concatenate the Strings
    }
}
