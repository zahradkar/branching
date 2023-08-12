import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static void main(String[] args) {
//        System.out.println(makeAnagram("cde", "abc"));
//        System.out.println(makeAnagram("aslkdjfasdfa", "a;sldkjfp"));
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }

    public static int makeAnagram(String a, String b) {
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        for (int i = 0; i < a.length(); i++)
            if (mapA.containsKey(a.charAt(i)))
                mapA.put(a.charAt(i), (mapA.get(a.charAt(i)) + 1));
            else
                mapA.put(a.charAt(i), 1);

        for (int i = 0; i < b.length(); i++)
            if (mapB.containsKey(b.charAt(i)))
                mapB.put(b.charAt(i), (mapB.get(b.charAt(i)) + 1));
            else
                mapB.put(b.charAt(i), 1);


        int result = 0;
        for (Map.Entry<Character, Integer> entry : mapA.entrySet()) {
            Character key = entry.getKey();
            Integer value1 = entry.getValue();
            Integer value2 = mapB.getOrDefault(key, 0);

            result += Math.abs(value1 - value2);
            mapB.remove(key);
        }
        for (Map.Entry<Character, Integer> entry : mapB.entrySet()) {
            Character key = entry.getKey();
            Integer value1 = entry.getValue();
            Integer value2 = mapA.getOrDefault(key, 0);

            result += Math.abs(value1 - value2);
        }
        return result;
    }
}
