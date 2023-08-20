public class HighestScoringWord {
    public static void main(String[] args) {
        System.out.println(highestScoringWord(new String[]{"aac", "aab", "aaa", "aad"}));
    }

    private static String highestScoringWord(String[] input) {
        int indexOfMaximum = 0;
        int maximum = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++)
                sum += input[i].charAt(j);
            if (sum > maximum) {
                maximum = sum;
                indexOfMaximum = i;
            }
            sum = 0;
        }

        return input[indexOfMaximum];
    }
}