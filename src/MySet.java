import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class MySet {
    public static void main(String[] args) {
        String s = "laksdj lkjfa poseijf aplsdk japoerjpaosdk fmalksdjf paoisdfj";
        System.out.println("s: " + s);
        Set<Character> set = s.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());
        System.out.println(set);
//        if (s.ch)
    }

    private static String twoStrings(String s1, String s2) {
        // Write your code here

        Set<Character> set1 = s1.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());
        Set<Character> set2 = s2.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());

        if (!Collections.disjoint(set1, set2))
            return "YES";
        else
            return "NO";

        // for (int i=0;i<s1.length();i++)
        //     if (s2.contains(String.valueOf(s1.charAt(i))))
        //         return "YES";
        // return "NO";

    }
}
