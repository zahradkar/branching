import java.util.*;

public class Prac3 {
    public static void main(String[] args){
        System.out.println(averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 3));
        System.out.println(averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 2));
        System.out.println(averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 10));
    }

    private static double averageOfEveryNth(int[] input, int th){
        double sum = 0;
        int count = 0;
        for (int i=th-1; i<input.length; i+=th){
            sum += input[i];
            count++;
        }
        // System.out.println(sum);
        // System.out.println(count);
        if (Double.isNaN(sum/count))
            return 0.0;
        else
            return sum/count;

        // return sum/count;

    }
}
