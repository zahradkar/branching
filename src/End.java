/* Create a function called endsWithChar that takes a
string text and character endingChar as an input and returns
the number of all unique words in string that end with given
endingChar. Repeated uses of same word only count once.
You cannot use LINQ/Streams or similar functions that would
solve this with single command.

Example 1 endsWithS("ends with s characters", 's')
should return 3, because "ends with s characters" and all of
given words are unique.

Example 2 endsWithS("all is well that ends well", 'l')
should return 2, because while there are 3 words
that end with l ("all is well that ends well"), word "well"
is repated and will only count once. */

import java.util.HashSet;
import java.util.Set;

public class End {
    public static void main(String[] args) {
        System.out.println(endsWithChar("ends with s characters", 's'));
        System.out.println(endsWithChar("all is well that ends well", 'l'));
    }

    private static int endsWithChar(String text, char c) {
        String[] temp = text.split(" ");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < temp.length; i++)
            if (temp[i].charAt(temp[i].length() - 1) == c)
                set.add(temp[i]);
        return set.size();
    }
}