public class Wally {
    public static void main(String[] args) {
        System.out.println(wally("Wally"));
        System.out.println(wally("Where's Wally"));
        System.out.println(wally("Where's Waldo"));
        System.out.println(wally("DWally Wallyd .Wally"));
        System.out.println(wally("Hi Wally."));
        System.out.println(wally("It's Wally's."));
        System.out.println(wally("Wally Wally"));
        System.out.println(wally("'Wally Wally"));
    }

    private static int wally(String input) {
        for (int i = 0; i <= input.length() - 5; i++)
            if (input.charAt(i) == 'W')
                if (i == 0) {
                    if (i + 5 <= input.length() && input.substring(i, i + 5).equals("Wally"))
                        if (i + 5 <= input.length())
                            return i;
                        else if (i + 6 < input.length() && input.charAt(i + 6) > 'a' && input.charAt(i + 6) < 'z')
                            return i;
                } else if (input.charAt(i - 1) == ' ')
                    if (i + 5 <= input.length() && input.substring(i, i + 5).equals("Wally"))
                        if (i+6>=input.length())
                            return i;
                    else
                        if (input.charAt(i + 6) > 'a' && input.charAt(i + 6) < 'z')
                            return i;
        return -1;
    }
}