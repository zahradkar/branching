public class HighestLowest {
    public static void main(String... args) {
        System.out.println(highAndLow("1 2 3 4 5"));  // return "5 1"
        System.out.println(highAndLow("1 2 -3 4 5")); // return "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5")); // return "9 -5"
    }

    private static String highAndLow(String input) {
        String[] temp = input.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (short i = 0; i < temp.length; i++) {
            if (Integer.parseInt(temp[i]) > max)
                max = Integer.parseInt(temp[i]);
            if (Integer.parseInt(temp[i]) < min)
                min = Integer.parseInt(temp[i]);
        }

        return max + " " + min;
    }
}
