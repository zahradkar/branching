package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a method to return a list of strings which start with the specified character (method parameter) using the Stream API.
public class Ex7 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        System.out.println(filter('N', cities));

        List<String> expectedOutput;
        expectedOutput = Arrays.asList("ROME"); // for 'R'
        expectedOutput = Arrays.asList("NAIROBI", "NEW DELHI"); // for 'N'
    }

    private static List<String> filter(char c, List<String> input) {
        return input.stream().filter(x -> x.charAt(0) == c).collect(Collectors.toList());
    }
}
