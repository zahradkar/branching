public class StringIncrementer {
    public static void main(String[] args) {
        System.out.println(incrementString2("foo0042")); // foo0043
        System.out.println(incrementString2("foo1042")); // foo1043
        System.out.println(incrementString2("foo0099")); // foo0100
        System.out.println(incrementString2("foo1099")); // foo1100
        System.out.println(incrementString2("foo9999")); // foo10000
        System.out.println(incrementString2("foodoska")); // foodoska1
        System.out.println(incrementString2("0865019")); // 0865020
        System.out.println(incrementString2("999")); // 1000
    }

    private static String incrementString2(String input) {
        if (input.charAt(input.length() - 1) < '0' || input.charAt(input.length() - 1) > '9')
            return input + 1;

        int i = input.length() - 1;
        for (; i > 0; i--)
            if (input.charAt(i) != '9')
                if (input.charAt(i) >= '0' && input.charAt(i) <= '8')
                    break;
                else {
                    i++;
                    break;
                }

        return input.substring(0, i) + (Integer.parseInt(input.substring(i)) + 1);
    }
}

// String incrementer: Given a string with a number at the end, increment the number by 1 while preserving the original format of the string. Example input/output: incrementString("foo0042")
// returns "foo0043"