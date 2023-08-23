import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ClosestDistance {
    public static void main(String[] args) {
        System.out.println(closestDistance(new int[]{3, 6, 12, 1}));
		System.out.println(closestDistance(new int[]{1, 3, 98, 5, 99}));
		System.out.println(closestDistance(new int[]{1}));
    }

    private static int closestDistance(int[] input) {
        if (input.length < 2)
            return -1;

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < input.length; i++)
            set.add(input[i]);

        int distance = Integer.MAX_VALUE;

        Iterator<Integer> iterator = set.iterator();
        Integer current = iterator.next();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (Math.abs(current - next) < distance)
				distance = Math.abs(current - next);
            current = next;
        }
        return distance;
    }
}