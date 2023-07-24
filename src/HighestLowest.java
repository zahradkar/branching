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

        for (String i: temp) {
            if (Integer.parseInt(i) > max)
                max = Integer.parseInt(i);
            if (Integer.parseInt(i) < min)
                min = Integer.parseInt(i);
        }

        return max + " " + min;
    }
}
