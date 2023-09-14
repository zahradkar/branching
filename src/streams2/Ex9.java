package streams2;

import java.util.Map;
import java.util.stream.Collectors;

// ...return a map specifying the frequency of characters in a given string...
public class Ex9 {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.";
        Map<Character, Long> characterFrequencyMap = countCharacterFrequency(s);

        characterFrequencyMap.forEach((character, frequency) -> {
            System.out.println(character + ": " + frequency);
        });
// { =12, a=2, c=4, d=7, e=8, g=1, i=10, l=2, ,=2, L=1, m=5, n=4, .=1, o=7, p=3, r=4, s=6, t=7, u=4}
    }

    public static Map<Character, Long> countCharacterFrequency(String input) {
        return input.chars()  // Convert the string to an IntStream of character codes
                .mapToObj(ch -> (char) ch)  // Convert character codes back to characters
                .collect(Collectors.groupingBy(
                        character -> character,  // Group by character
                        Collectors.counting()    // Count the occurrences
                ));
    }
}
