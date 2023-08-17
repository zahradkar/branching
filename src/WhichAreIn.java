import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {
    public static void main(String[] args) {
        String[] a1 = new String[]{"arp", "live", "strong"};
        String[] a2 = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        for (var string : whichAreIn(a1, a2))
            System.out.println(string);

        a1 = new String[]{"tarp", "mice", "bull"};
        a2 = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        for (var string : whichAreIn(a1, a2))
            System.out.println(string);
    }

    private static String[] whichAreIn(String[] a1, String[] a2) {
        Set<String> result = new TreeSet<>();
        for (var i = 0; i < a1.length; i++)
            for (var j = 0; j < a2.length; j++)
                if (a2[j].contains(a1[i]))
                    result.add(a1[i]);
        return result.toArray(new String[result.size()]);
    }
}
