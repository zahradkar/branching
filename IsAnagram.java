import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        // System.err.println("skuska");
        System.out.println(isAnagram("anagramm", "marganaa"));
    }

    private static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Short> mapA = new HashMap<>();
        Map<Character, Short> mapB = new HashMap<>();

        for (short i = 0; i < a.length(); i++)
            if (mapA.containsKey(a.charAt(i)))
                mapA.put(a.charAt(i), (short) (mapA.get(a.charAt(i)) + 1));
            else
                mapA.put(a.charAt(i), (short) 1);

        for (short i : mapA.values())
            System.out.println(i);
        return false;
    }
}
