/* Content filter Create a function called contentFilter that
takes a number array(numbers) and returns a new array / list that
doesn't include any zeroes or the numbers that are between two
zeroes (think of the zeroes as parentheses [these things: ()] - there
should be an "opening" 0 and a "closing" 0 and all the numbers
between them should be removed.)

Example cases:
contentFilter([1,2,3,4]); Should return [1,2,3,4] because there are no zeros.
contentFilter([1,2,0,3,4,0,5,6]); Should return [1,2,5,6].
contentFilter([1,2,0,3,4,5,6]); Should return [1,2] because there is no finishing zero.
contentFilter([1, 2, 0, 3, 4, 0, 5, 0, 12, 0, -2])
Should return [1, 2, 5, -2] as only things between
pairs of zeroes are removed. */

import java.util.ArrayList;
import java.util.List;

public class ContentFilter {
    public static void main(String[] args) {
        // int[] a = contentFilter([1,2,3,4]);

        System.out.println(contentFilter(new int[]{1, 2, 3, 4})); // 1,2,3,4
        System.out.println(contentFilter(new int[]{1, 2, 0, 3, 4, 0, 5, 6})); // 1,2,5,6
        System.out.println(contentFilter(new int[]{1, 2, 0, 3, 4, 5, 6})); // 1,2
        System.out.println(contentFilter(new int[]{1, 2, 0, 3, 4, 0, 5, 0, 12, 0, -2})); // 1,2,5,-2
        //for (int i=0; i<a.length; i++)
        //System.out.println();
    }

    private static List<Integer> contentFilter(int[] input) {
        ArrayList<Integer> tempResult = new ArrayList<>();
        boolean zero = false;
        for (int i = 0; i < input.length; i++)
            if (zero) {
                if (input[i] == 0)
                    zero = false;
            } else if (input[i] == 0)
                zero = true;
            else
                tempResult.add(input[i]);
        int[] result = new int[tempResult.size()];
        for (int i = 0; i < result.length; i++)
            result[i] = tempResult.get(i);
        return tempResult;
    }
}