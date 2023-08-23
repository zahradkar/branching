import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TypeConversions {
    public static void main(String[] args) {
        String str = "Hello"; // String -> char
        char firstChar = str.charAt(0); // Extract the first character from the string


        char myChar = 'A'; // char -> String
        String charAsString = Character.toString(myChar); // Convert char to String


        String strNumber = "123"; // String -> int
        int intNumber = Integer.parseInt(strNumber); // Convert String to int


        int num = 456; // int -> String
        String numAsString = Integer.toString(num); // Convert int to String
        String numAsString2 = num + ""; // tricky way


        char digitChar = '7'; // char -> int
        int digitInt = Character.getNumericValue(digitChar); // Convert char '7' to int 7
        int i = str.charAt(0) - '0'; // tricky way


        int asciiValue = 65; // ASCII value of 'A'      int -> char
        char character = (char) asciiValue; // Convert int to char ('A')


        String[] stringArray = {"apple", "banana", "cherry", "banana", "apple"};
        Set<String> stringSet = new HashSet<>(Arrays.asList(stringArray)); // Convert the String array to a Set using HashSet
    }
}
