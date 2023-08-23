import java.util.HashSet;
import java.util.Set;

public class IrregularListing {
    public static void main(String[] args) {
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5}, 1));
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(irregularListing(new int[]{1, 2, 3, 4, 5, 6}, 3));
    }

    private static boolean irregularListing(int[] input, int number) {
        Set<Integer> mnozina = new HashSet<>();
        int index = 0;
        do {
            if (mnozina.size() == input.length)
                return true;
            if (!mnozina.contains(index))
                mnozina.add(index);
            else
                return false;
            index += number;
            if (index >= input.length)
                index -= input.length;

        } while (true);
    }
}